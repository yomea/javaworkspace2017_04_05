package com.reduce;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReduceTest {
	
	
	public static void main(String[] args) {
		
		
		Stream<Integer> stream = Stream.of(12,345, 2);
		
		
		System.out.println(stream.reduce(5, Integer::sum));//5 + v1 + v2....
		
		System.out.println(Stream.of(12,345, 2).reduce(Integer::sum).get());
		
	}

}
