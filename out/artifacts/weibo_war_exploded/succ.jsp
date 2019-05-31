<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%    
      //设置请求
      request.setCharacterEncoding("utf-8");
      String username = request.getParameter("username");
      String password = request.getParameter("password"); 
     // out.print(username+":"+password);
      if("admin".equals(username) && "123".equals(password))
      {
    	  response.sendRedirect("index.jsp");
    	  
      }else {
    	  
    	  request.setAttribute("tips", "用户名错误");
    	  pageContext.setAttribute("pageTips", "我是page");
    	  //转发形式
    	  request.getRequestDispatcher("/login.jsp").forward(request,response);
      }

%>