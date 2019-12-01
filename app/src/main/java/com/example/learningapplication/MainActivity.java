package com.example.learningapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.learningapplication.bean.OkHttp;
import com.example.learningapplication.bean.UserLogin;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

// C
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    EditText etUsername;
    EditText etPassword;
    Button btLogin;
    private Handler handler;

    // todo 4 创建handler， 目的：将子线程数据发给主线程，更新ui元素
    class Handler extends android.os.Handler {
        public static final int MSG_UPDATE = 1;
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MSG_UPDATE: {
                    // 处理你的消息
                    String msgStr = (String)msg.obj;
                    updateUI(msgStr);
                    break;
                }
            }
            super.handleMessage(msg);
        }
    }

    private void updateUI(String msgStr) {
        // todo 5 主线程处理返回数据
        Log.d(TAG, "update ui, main thread id：" + Thread.currentThread().getName()+ "/" + Thread.currentThread().getId());
        etUsername.setText(msgStr);
    }
    // ctrl d 复制行到下一行

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // alt + 单击 点击进入资源文件
        // xml View
        setContentView(R.layout.activity_main);
        // view
        // alt + enter 快速创建方法
        initView();

        // Model 网络数据 本地数据 内存数据 JavaBean
        initData();

        // 实例化handler对象
        handler = new Handler();
    }

    private void initData() {
        OkHttp okHttp = new OkHttp(this);

        Log.d(TAG, "main thread id：" + Thread.currentThread().getName()+ "/" + Thread.currentThread().getId());
        // 正确示范1. 通过new 新建一个线程，然后子线程执行请求
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Log.d(TAG, "child thread id：" + Thread.currentThread().getId());
                    Log.d(TAG, "initData: request data success: " + okHttp.get());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        // todo 3 异步请求
        okHttp.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responseMsg = response.body().toString();
                Log.d(TAG, "child thread id：" + Thread.currentThread().getId());
                Log.d(TAG, "onResponse: " + responseMsg);

                Message msg = handler.obtainMessage();
                msg.obj = responseMsg;
                msg.what = Handler.MSG_UPDATE;
                // 发送信息
                Log.d(TAG, "onResponse: send msg to handler");
                handler.sendMessage(msg);
            }
        });
        // 简化
//        new Thread(() -> {
//
//        }).start();

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    private void initView() {
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btLogin = findViewById(R.id.bt_login);
        // shift 空格
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserLogin userLogin = new UserLogin(etUsername, etPassword, new ErrorCallback() {
                    @Override
                    public void onError(String err) {
                        showMsg(err);
                    }
                });
                /*
                 *  json {
                 *   username: "username",
                 *   password: "password"
                 *  }
                 *
                 *
                 *
                 * */


                // toast
//                Toast.makeText(MainActivity.this, "显示： " + username + "/" + password, Toast.LENGTH_SHORT).show();
                // 跳转

                if (userLogin.isSuccess()) {
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                }

                Log.i(TAG, "onClick: ");
            }
        });
    }

    private void showMsg(String err) {
        Toast.makeText(this, err + ",请重新输入", Toast.LENGTH_SHORT).show();
    }

}
