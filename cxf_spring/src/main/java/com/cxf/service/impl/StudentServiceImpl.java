package com.cxf.service.impl;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.cxf.entity.Student;
import com.cxf.service.StudentService;

@WebService (
		serviceName="StudentServiceImplServer",
		name = "StudentServiceImpl", //服务实现类的名字
		portName="StudentServiceImplPort",
		targetNamespace="impl.server.cxf.com"
		
		)

public class StudentServiceImpl implements  StudentService{
	//这里的webResult指的是容器中接收的类型名
	public @WebResult(name="student") List<Student> find(@WebParam(name="id") int id) {
		
		System.out.println("hello ......");
		return null;
	}

	@WebMethod(operationName="findAll")
	@Override
	public List<Student> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
