package com.ztkj.utils;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * author li
 * create time 2019-04-15 15:49
 **/



public class mybatisUtils {
    public static SqlSessionFactory getFactory(){
        // 文件名
        String config = "conf.xml";
        // 使用类加载器获得文件流
        InputStream confStreacm = mybatisUtils.class.getClassLoader().getResourceAsStream(config);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(confStreacm);
        return factory;
    }
}
