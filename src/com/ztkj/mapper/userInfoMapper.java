package com.ztkj.mapper;/**
 * author li
 * create time 2019-04-15 15:33
 **/

import com.ztkj.model.userInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface userInfoMapper {
    @Select("select * from userInfo ")
    public List<userInfo> getAllUserInfo();

    @Select("select * from userInfo where u_account = #{u_account} and u_password = #{u_password}")
    public userInfo login(userInfo userInfo);

    @Insert("insert into userInfo (u_account,u_password,u_nick,u_img,u_sex,u_name,u_addr) values (#{u_account},#{u_password},#{u_nick},#{u_img},#{u_sex},#{u_name},#{u_addr})")
    public int register(userInfo userInfo);
}
