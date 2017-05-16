package com.distinct;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDistinct {
	
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("root", "admin", "admin").distinct();
		
		Object[] obj =  stream.toArray();
		
		System.out.println(Arrays.toString(obj));
		
		
		System.out.println(obj.getClass());
		
	}

}
