package com.example.learningapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.learningapplication.bean.UserLogin;

// C
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    EditText etUsername;
    EditText etPassword;
    Button btLogin;
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
