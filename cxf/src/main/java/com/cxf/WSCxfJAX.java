package com.cxf;

import javax.jws.WebService;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * 这种方式支持注解，并且支持日志
 * 使用JDK工具wsimport -s . -p com.cxf.server http://localhost:8888/ws?wsdl 生成jar包
 * @author may
 *
 */
@WebService(serviceName = "WSCxfJAXServer")
public class WSCxfJAX {

	public void sayHello() {

		System.out.println("hello world...");

	}

	public static void main(String[] args) {

		JaxWsServerFactoryBean jsfb = new JaxWsServerFactoryBean();

		jsfb.setServiceBean(new WSCxfJAX());

		jsfb.setAddress("http://localhost:8888/ws");
		//添加请求到达时的日志拦截器
		jsfb.getInInterceptors().add(new LoggingInInterceptor());
		//添加放回数据时的日志拦截器
		jsfb.getOutInterceptors().add(new LoggingOutInterceptor());

		jsfb.create();
		
		System.out.println("http://localhost:8888/ws?wsdl");

	}

}
