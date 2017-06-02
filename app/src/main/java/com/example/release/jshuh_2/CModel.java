package com.example.release.jshuh_2;

import java.util.ArrayList;

/**
 * Created by release on 2017. 5. 26..
 */

public class CModel {


    int type;
    String user_name;
    String user_img;
    String user_text;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_img() {
        return user_img;
    }

    public void setUser_img(String user_img) {
        this.user_img = user_img;
    }

    public String getUser_text() {
        return user_text;
    }

    public void setUser_text(String user_text) {
        this.user_text = user_text;
    }


    public CModel(int type, String user_name, String user_img, String user_text){
        this.type = type;
        this.user_name = user_name;
        this.user_img = user_img;
        this.user_text = user_text;

    }

    ArrayList<CModel> mmm = new ArrayList<>();


}
