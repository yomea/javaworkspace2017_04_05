package com.threadPool;

import java.util.Date;

public class Test {

	private static long time = 0L;
	
	public static void main(String[] args) throws InterruptedException {

		MyThreadPool pool = new MyThreadPool();

		for (int i = 0; i < 5; i++) {
			pool.execute(new Runnable() {

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
