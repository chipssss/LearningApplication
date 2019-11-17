package com.example.learningapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.learningapplication.bean.CropRecord;
import com.example.learningapplication.bean.Response;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
    RecyclerView rv;
    CropRvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    private void initView() {
        // recylerView一些配置方法
        rv = findViewById(R.id.rv);
        // 利用构造方法传输 解析的假数据
        adapter = new CropRvAdapter(mockData());
        rv.setAdapter(adapter);
        // 设置recyclerview 的布局管理区，指定为线性布局
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                false));
        // 添加分割线
        rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    /**
     * todo 1.0 利用gson解析json 生成假数据
     * 注意导入第三方gson包     implementation 'com.google.code.gson:gson:2.8.6'
     * @return
     */
    private List<CropRecord> mockData() {
        // gson 读取json数据
        List<CropRecord> cropRecordList = new Gson().fromJson(Response.JSON_DATA,
                new TypeToken<List<CropRecord>>(){}.getType());
        Log.d(TAG, "mockData: get cropList: " + cropRecordList.toString());
        return cropRecordList;
    }
}
