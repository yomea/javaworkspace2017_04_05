package com.memcached;

import java.io.IOException;
import java.net.InetSocketAddress;

import net.spy.memcached.MemcachedClient;

public class MemcachedConn {
	
	
	public static void main(String[] args) throws IOException {
		
		MemcachedClient mc = new MemcachedClient(new InetSocketAddress("192.168.243.128", 11211));
		
		System.out.println("连接成功！！！");
		
		mc.shutdown();
		
	}

}
