package com.ezen.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.controller.action.Action;
import com.ezen.controller.action.ActionFactory;

@WebServlet("/shop")
public class ShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String command = request.getParameter("command");
	      System.out.println("BoardServlet에서 요청을 받음을 확인 : " + command);
	      
	      ActionFactory af = ActionFactory.getInstance();
	      Action action = af.getAction(command);
	      
	      if(action != null) {
	         try {
	            action.execute(request, response);
	         } catch (ServletException e) {
	            e.printStackTrace();
	         } catch (Exception e) {
	            e.printStackTrace();
	         }
	      }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
