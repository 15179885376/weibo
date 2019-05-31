package com.ztkj.serverlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaseServlet
 */

public class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
    private HttpServletResponse response;
  @Override
protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	  request.setCharacterEncoding("UTF-8");
	  response.setCharacterEncoding("utf-8");
	  this.request= request;
	  this.response = response;
	  super.service(request, response);
	
}
  
  /*
   * 获取参数值
   * return 
   */
    protected String getParam(String name) {
    	
    	return request.getParameter(name);
		
	}
  
  
}
