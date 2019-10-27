package com.example.learningapplication.bean;

import android.text.TextUtils;
import android.widget.EditText;

import com.example.learningapplication.ErrorCallback;

/**
 * @author: chips
 * @date: 2019/10/27
 * @description:
 **/
public class UserLogin {
    private boolean success;
    String username;
    String password;





    // ctrl n


    public UserLogin(EditText etUsername, EditText etPassword, ErrorCallback errorCallback) {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        if (TextUtils.isEmpty(username)) {
            // 用户名为空
            errorCallback.onError("用户名为空");
            etUsername.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            // 密码为空检验
            errorCallback.onError("密码为空");
            etPassword.requestFocus();
            return;
        }
        // 表示校验成功
        success = true;
        this.username = username;
        this.password = password;
    }

    public boolean isSuccess() {
        return success;
    }
}
