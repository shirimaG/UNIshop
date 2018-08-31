package com.example.goodluck.unishop1;

import android.media.Image;
import android.widget.ImageView;

public class AbstractModel {
    private String description;
    private String price;
    private int imageResourceId;

    public AbstractModel(String description, String price, int imageResourceId){
        this.description = description;
        this.price =price;
        this.imageResourceId = imageResourceId;
    }
    public AbstractModel(){

    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price){
        this.price = price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
    public void setImageResourceId(int imageResourceId){
        this.imageResourceId = imageResourceId;
    }
}

