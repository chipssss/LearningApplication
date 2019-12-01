package com.example.learningapplication.bean;

import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author: chips
 * @date: 2019/11/18
 * @description:
 **/
public class OkHttp {
    private static final String REQUEST_URL = "https://wanandroid.com/wxarticle/list/408/1/json";
    private static final long CONNECT_TIME_OUT = 10;
    private static final String TAG = "OkHttp";
    private final OkHttpClient client;

    public OkHttp(Context context) {
        // todo 1. 构建一个client
        client = new OkHttpClient();
//        client = new OkHttpClient.Builder()
//                .cache(new Cache(new File(context.getExternalCacheDir(), "test_cache"), 10 * 1024 * 1024))
//                .connectTimeout(CONNECT_TIME_OUT, TimeUnit.MINUTES) // 方便调试
//                .writeTimeout(CONNECT_TIME_OUT, TimeUnit.MINUTES)
//                .build();
    }

    public String get() throws IOException {
        Request request = new Request.Builder()
                .url(REQUEST_URL)
                .build();
        // 发起请求
        Response response = client.newCall(request).execute();

        return response.body().string();
    }

    public void enqueue(Callback callback) {
        // todo 2. 构建request，指定url
        Request request = new Request.Builder()
                .url(REQUEST_URL)
                .build();
        // enqueue 异步
        client.newCall(request).enqueue(callback);
    }
}
