package com.example.al.newshub;

/**
 * Created by Al on 2018/4/26.
 */

public class News {
    private String title;
    private String info;
    private int imageId;
    public News(String title,String info,int imageId) {
        this.title=title;
        this.info=info;
        this.imageId = imageId;
    }
    public String gettitle() {
        return title;
    }
    public String getinfo() {
        return info;
    }
    public int getImageId() {
        return imageId;
    }
}
