package com.example.learningapplication.bean;

import java.util.List;

/**
 * @author: chips
 * @date: 2019/11/9
 * @description:
 **/
public class Response {
    DataResponse data;
    int errorCode;
    int errorMsg;

    private class DataResponse {
        int curPage;
        List<Article> datas;

        public int getCurPage() {
            return curPage;
        }

        public List<Article> getDatas() {
            return datas;
        }
    }
}
