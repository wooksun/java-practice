package com.jsp.ex.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Sample")
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L; //static(정적변수), final(상수화 시키는 것) 따라서 생략가능
       
    
    public Sample() { //디폴트 생성자(생략가능)
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("DoGet() 메서드 실행");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("DoPost() 메서드 실행");
	}

}
