package com.ztkj.dao;/**
 * author li
 * create time 2019-04-17 22:11
 **/

import com.ztkj.mapper.blogMapper;
import com.ztkj.model.blog;
import com.ztkj.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class blogDao {
    public int addBlog(blog blog){
        // 在session关闭前数据回话一直连接，数据库数据才会发生改变
        SqlSession session = mybatisUtils.getFactory().openSession();
        blogMapper mapper = session.getMapper(blogMapper.class);
        // 获取数据
        int res = 0;
        res = mapper.addBlog(blog);
        session.commit();
        return res;
    }

    public List<blog> getUserBlog(int id){
        // 在session关闭前数据回话一直连接，数据库数据才会发生改变
        SqlSession session = mybatisUtils.getFactory().openSession();
        blogMapper mapper = session.getMapper(blogMapper.class);
        // 获取数据
        List<blog> res = mapper.getUserBlog(id);
        return res;
    }
}
