package com.aggregate;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Aggregate {
	
	
	public static void main(String[] args) {
		
		int[] ints = {33, 45, 456, 234,67235,6856 ,86 };
		
		IntStream stream = Arrays.stream(ints);
		 OptionalInt oInt 
		 = stream.max();
		 
		System.out.println(oInt.getAsInt());
		 
		
	}

}
