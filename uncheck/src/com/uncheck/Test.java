package com.uncheck;

import java.util.concurrent.Callable;

public class Test {
	
	/**
	 * 写一段这样的代码，以后都不需要手动在try catch了
	 * @param runner
	 * @return
	 */
	public static Runnable uncheck(RunnableEx runner) {
		
		
		
		return ()->{
			
			try {
				runner.run();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		};
	}
	
public static Runnable uncheck(Callable<String> runner) {
		
		
		
		return ()->{
			
			try {
				runner.call();//得不到返回值
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		};
	}
	
	
	public static void main(String[] args) {
		
		new Thread(uncheck(()->{
			
			Thread.sleep(1000);//这里无需捕获异常
			
			System.out.println("hello baby...");
			
		})).start();
		
	}

}
