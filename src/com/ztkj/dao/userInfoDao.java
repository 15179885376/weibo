package com.ztkj.dao;

import com.ztkj.model.userInfo;
import com.ztkj.utils.mybatisUtils;
import com.ztkj.mapper.userInfoMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * author li
 * create time 2019-04-15 16:12
 **/



public class userInfoDao {
    public List<userInfo> gerAllUser(){
        // 在session关闭前数据回话一直连接，数据库数据才会发生改变
        SqlSession session = mybatisUtils.getFactory().openSession();
        userInfoMapper mapper = session.getMapper(userInfoMapper.class);
        // 获取数据
        List<userInfo> users = mapper.getAllUserInfo();
        session.close();
        return users;
    }

    public userInfo login(userInfo userInfo){
        // 在session关闭前数据回话一直连接，数据库数据才会发生改变
        SqlSession session = mybatisUtils.getFactory().openSession();
        userInfoMapper mapper = session.getMapper(userInfoMapper.class);
        // 获取数据
        userInfo user = mapper.login(userInfo);
        session.close();
        return user;
    }

    public int register(userInfo userInfo){
        int res = 0;
        SqlSession session = mybatisUtils.getFactory().openSession();
        userInfoMapper mapper = session.getMapper(userInfoMapper.class);
        try {
            res = mapper.register(userInfo);
            session.commit();
        }catch (Exception e){
            System.out.println("插入数据异常~");
        }
        session.close();
        return res;
    }
}
