package com.memcached;

import java.net.InetSocketAddress;

import net.spy.memcached.MemcachedClient;
import net.spy.memcached.internal.OperationFuture;

public class MemcachedReplace {
	
	
	public static void main(String[] args) throws Exception {
		
		MemcachedClient mc = new MemcachedClient(new InetSocketAddress("192.168.243.128", 11211));
		
		System.out.println("连接成功！！！");
		//key->value
		OperationFuture<Boolean> future = mc.replace("key", 900, "value");
		
		System.out.println("设置：" + future.get());
		
		Object obj = mc.get("key");
		
		System.out.println(obj);
		
		mc.shutdown();
		
	}

}
