package com.ztkj.test;/**
 * author li
 * create time 2019-04-15 16:24
 **/

import com.ztkj.dao.blogDao;
import com.ztkj.model.blog;

import java.util.Date;
import java.util.List;

public class test {
    public static void main(String args[]) {
        blogDao dao = new blogDao();
        blog blog = new blog();
        blog.setU_id(1);
        blog.setB_img("hello.jpg");
        blog.setB_time(new Date());
        blog.setB_degree(10);
        blog.setB_content("hello world");
        int res = dao.addBlog(blog);
        if (res>0){
            System.out.println("发布微博成功\n");
        }else {
            System.out.println("发布失败");
        }
        List<blog> resList = dao.getUserBlog(1);
        for (blog x:resList){
            System.out.println(x.getB_content());
        }
    }
}
