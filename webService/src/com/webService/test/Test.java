package com.webService.test;

import com.webService.client.WebServiePublish;
import com.webService.client.WebServiePublishService;

public class Test {
	
	public static void main(String[] args) {
		
		//<service name="WebServiePublishService"> 获取服务名
		WebServiePublishService wsps = new WebServiePublishService();
		
		//port name="WebServiePublishPort"  get post soap
		WebServiePublish wsp = wsps.getWebServiePublishPort();
		
		wsp.sayHello("world");
		
	}

}
