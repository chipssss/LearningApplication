package com.example.learningapplication.bean;

/**
 * @author: chips
 * @date: 2019/11/9
 * @description:
 **/
public class Article {
    String niceDate;
    String link;
    String superChapterName;
    String shareUser;
    String title;

    public Article(String niceDate, String link, String superChapterName, String shareUser, String title) {
        this.niceDate = niceDate;
        this.link = link;
        this.superChapterName = superChapterName;
        this.shareUser = shareUser;
        this.title = title;
    }

    public String getNiceDate() {
        return niceDate;
    }

    public void setNiceDate(String niceDate) {
        this.niceDate = niceDate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSuperChapterName() {
        return superChapterName;
    }

    public void setSuperChapterName(String superChapterName) {
        this.superChapterName = superChapterName;
    }

    public String getShareUser() {
        return shareUser;
    }

    public void setShareUser(String shareUser) {
        this.shareUser = shareUser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
