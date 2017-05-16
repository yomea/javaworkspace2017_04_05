package com.lambda.test;

class T {
	
	public void grate() {
		
		System.out.println("haha");
		
	}
	
}

public class This_super_test extends T {
	
	
	public void grate() {
		//引用父类的实现
		Thread t = new Thread(super::grate);
		t.start();
		
	}
	
	public static void main(String[] args) {
		
		new This_super_test().grate();
		
		
	}
	

}
