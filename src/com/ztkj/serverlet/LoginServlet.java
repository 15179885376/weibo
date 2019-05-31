package com.ztkj.serverlet;

import com.ztkj.dao.userInfoDao;
import com.ztkj.model.userInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * author li
 * create time 2019-04-17 14:08
 **/
@WebServlet(name = "LoginServlet")
public class LoginServlet extends BaseServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = getParam("userid");
        String Password = getParam("password");
        userInfo user  = new userInfo();
        user.setU_account(userName);
        user.setU_password(Password);
        userInfoDao dao = new userInfoDao();
        userInfo info = dao.login(user);
        if (info != null && info.getU_id() > 0){
            String name = info.getU_account();
            request.getSession().setAttribute("userName",name);
            response.sendRedirect("home.jsp");
        }else {
            request.setAttribute("tips","登录失败~");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
