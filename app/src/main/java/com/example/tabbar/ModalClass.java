package com.example.tabbar;

public class ModalClass {

    private int imageRecourse;
    private String title;
    private String body;

    public ModalClass(int imageRecourse, String title, String body) {
        this.imageRecourse = imageRecourse;
        this.title = title;
        this.body = body;
    }

    public int getImageRecourse() {
        return imageRecourse;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
