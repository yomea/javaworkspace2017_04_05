package com.lambda;

@FunctionalInterface
public interface Lambda_arg {
	
	public static void print() {}
	
	public abstract void printSomeInfo(Object obj);
	
	public default void printMessage() {
		
		System.out.println(this.getClass());
		
		printSomeInfo(null);
		
	}
	

}
