package com.cxf.action;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cxf.service.StudentService;
import com.cxf.service.impl.StudentServiceImpl;

public class StudentAction extends HttpServlet {
 
	private StudentService ss;
	
	private static final long serialVersionUID = 4698098062760791406L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());
		ss = wac.getBean("studentService", StudentService.class);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ss.find();
	}
	
	

}
