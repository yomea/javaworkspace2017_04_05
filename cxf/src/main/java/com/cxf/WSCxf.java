package com.cxf;

import org.apache.cxf.frontend.ServerFactoryBean;

/**
 * 这种方式不支持注解
 * @author may
 *
 */
public class WSCxf {
	
	public void sayHello() {
		
		System.out.println("hello world...");
		
	}
	
	
	public static void main(String[] args) {
		
		ServerFactoryBean sfb = new ServerFactoryBean();
		
		sfb.setServiceBean(new WSCxf());
		
		sfb.setAddress("http://localhost:8080/ws");
		
		sfb.create();
		
		System.out.println("访问的地址为：http://localhost:8080/ws?wsdl");
		
	}

}
