package com.webService.publish;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * 默认静态方法是不会被发布的,
 * 生成的xml格式就是xml.xml中显示的那样
 * @author may
 *
 */
@WebService(
		name="WebServiePublish",//服务实现类的名字
		serviceName="WebServiePublishServer",//服务发布后的服务名
		portName="WebServiePublishServerPort",
		targetNamespace="public.webService.com"//默认为包名的倒叙
		)
public class WebServiePublish {
	
	@WebMethod(exclude=true)//这个服务不会被发布
	public void sayHello(String name) {
		
		System.out.println("hello " + name);
		
	}
	//@WebParam如果不写，在wsdl中显示的是arg0，arg1，@WebResult不写，在wsdl中显示的标签是return
	public @WebResult(name="hehe") void sayHello(@WebParam(name="name") String name, @WebParam(name="age") int age) {
		
		System.out.println("hello " + name);
		
	}
	
	
	
	public static void main(String[] args) {
		
		String address_1 = "http://192.168.0.104:6666/ws_1";
		
		String address_2 = "http://192.168.0.104:6666/ws_2";
		
		Endpoint.publish(address_1, new WebServiePublish());
		
		Endpoint.publish(address_2, new WebServiePublish());
		
		System.out.println("服务访问的地址为：" + address_1 + "?WSDL");
		
		System.out.println("服务访问的地址为：" + address_2 + "?WSDL");
		
	}

}
