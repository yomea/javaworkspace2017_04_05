package com.lambda.test;

import java.util.Arrays;

public class CompartorTest {

	public static void main(String[] args) {

		Integer[] arr = new Integer[] { 134, 22, 22, 3, 564, 256725, 76, 747, 8567, 747 };
		/**
		 * 如果只有一条语句的话，可以这样写
		 * ( a,  b) -> 
			 a > b ? 1 : a == b ? 0 : -1
			 
		
		 */
		Arrays.sort(arr, ( a,  b) -> {
			return	 a > b ? 1 : a == b ? 0 : -1;
		});

		System.out.println(Arrays.toString(arr));

	}
	
}
