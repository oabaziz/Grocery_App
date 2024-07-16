package com.example.grocery_app;

public class Item {
    int img ;
    String text_1;
    String text_2;

    public Item(int img, String text_1, String text_2) {
        this.img = img;
        this.text_1 = text_1;
        this.text_2 = text_2;
    }

    public int getImg() {
        return img;
    }

    public String getText_1() {
        return text_1;
    }

    public String getText_2() {
        return text_2;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setText_1(String text_1) {
        this.text_1 = text_1;
    }

    public void setText_2(String text_2) {
        this.text_2 = text_2;
    }
}
