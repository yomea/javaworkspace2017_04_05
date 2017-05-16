package com.lambda;

@FunctionalInterface
public interface Lambda_noArg {
	
	public static void print() {}
	
	public void printSomeInfo();
	
	public default void printMessage() {}
	

}
