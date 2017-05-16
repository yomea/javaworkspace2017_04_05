package com.stackOverflower;

/**
 * java.lang.StackOverflowError
 * @author may
 *
 */
public class StackOverflow {
	
	public static void test() {
		
		test();
		
	}

	public static void main(String[] args) {
		
		StackOverflow.test();
		
	}
	
}
