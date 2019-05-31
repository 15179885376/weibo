package com.ztkj.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import com.ztkj.model.blog;

/**
 * author li
 * create time 2019-04-17 22:04
 **/
public interface blogMapper {

    @Select("select * from blog where u_id = #{id}")
    public List<blog> getUserBlog(int id);

    @Insert("insert into blog(u_id,b_content,b_time,b_img,b_degree) values(#{u_id},#{b_content},#{b_time},#{b_img},#{b_degree})")
    public int addBlog(blog blog);

}
