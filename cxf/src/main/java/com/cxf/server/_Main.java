package com.cxf.server;

/**
 * 先通过get请求得到wsdl
 * 然后通过post请求数据，最后放回数据
 * @author may
 *
 */
public class _Main {
	
	public static void main(String[] args) {
		
		WSCxfJAXServer wjs = new WSCxfJAXServer();
		
		WSCxfJAX wf = wjs.getWSCxfJAXPort();
		
		wf.sayHello();
		
	}

}
