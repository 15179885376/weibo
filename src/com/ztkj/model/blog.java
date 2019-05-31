package com.ztkj.model;

import java.util.Date;

/**
 * author li
 * create time 2019-04-17 22:01
 **/

public class blog {
    private int u_id,b_degree;
    private String b_content,b_img;
    private Date b_time;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getB_degree() {
        return b_degree;
    }

    public void setB_degree(int b_degree) {
        this.b_degree = b_degree;
    }

    public String getB_content() {
        return b_content;
    }

    public void setB_content(String b_content) {
        this.b_content = b_content;
    }

    public String getB_img() {
        return b_img;
    }

    public void setB_img(String b_img) {
        this.b_img = b_img;
    }

    public Date getB_time() {
        return b_time;
    }

    public void setB_time(Date b_time) {
        this.b_time = b_time;
    }


}
