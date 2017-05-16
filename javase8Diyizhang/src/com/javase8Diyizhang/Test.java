package com.javase8Diyizhang;

public class Test {
	
	public static Runnable andTen(Runnable r_1, Runnable r_2) {
		
		
		
		
		return ()->{
			
			new Thread(r_1).start();
			
			new Thread(r_2).start();
			
		};
	}
	
	public static void main(String[] args) {
		Runnable r = andTen(()->{System.out.println("r_1");},()->{System.out.println("r_2");});
		
		new Thread(r).start();
		
	}

}
