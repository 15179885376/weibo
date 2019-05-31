package com.ztkj.serverlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ztkj.dao.userInfoDao;

import com.ztkj.model.userInfo;

/**
 * Servlet implementation class RegistServlet
 */
public class RegistServlet extends BaseServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String yzm = getParam("yzm");
        if(request.getSession().getAttribute("yzmcode").equals(yzm)){

        }else {
            request.setAttribute("tips","验证码输入错误~");
            request.getRequestDispatcher("register.jsp").forward(request,response);
            return;
        }

        String email = getParam("email");
        String password = getParam("npassword");
        String nick = getParam("nickname");
        String sex = getParam("sex");
        String question = getParam("question");
        String city = getParam("city");
        userInfo userInfo = new userInfo();
        userInfo.setU_account(email);
        userInfo.setU_mail(email);
        userInfo.setU_password(password);
        userInfo.setU_nick(nick);
        userInfo.setU_sex(sex);
        userInfo.setU_question(question);
        userInfo.setU_addr(city);
        int result = 0;
        try {
            userInfoDao dao = new userInfoDao();
            result = dao.register(userInfo);
        } catch (Exception e) {
            System.out.println("x");
            e.printStackTrace();
        }
        if (result > 0) {
            //注册成功
            response.sendRedirect("index.jsp");
        } else {
            //注册失败
            request.setAttribute("tips", "注册失败");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }

}
