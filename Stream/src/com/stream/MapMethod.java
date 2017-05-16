package com.stream;

import java.util.stream.Stream;

public class MapMethod {
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("a","b","sdfgd");
		
		Stream<String> stream2 = stream.map((x)->x.toUpperCase());
		
		System.out.println(stream == stream2);
		
	}

}
