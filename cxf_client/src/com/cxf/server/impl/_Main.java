package com.cxf.server.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class _Main extends HttpServlet {

	private static final long serialVersionUID = -5528049667715950262L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentServiceImplServer sss = new StudentServiceImplServer();
		
		StudentServiceImpl ssi = sss.getStudentServiceImplPort();
		
		ssi.find(0);
		
	}
	
	

}
