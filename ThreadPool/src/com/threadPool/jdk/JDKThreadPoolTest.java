package com.threadPool.jdk;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JDKThreadPoolTest {
	
	private static long time = 0L;

	public static void main(String[] args) throws InterruptedException {

		ExecutorService es = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 5; i++) {
			es.execute(new Runnable() {

				@Override
				public void run() {
					long start = System.currentTimeMillis();
					for(int i = 0; i < 1000000000; i++) {
						new Date();
						
					}
					long end = System.currentTimeMillis();
					time += end - start;
				}
			});
		}
		Thread.sleep(30000);
		System.out.println(time);
	}

}
