package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 展开集合
 * 
 * @author may
 *
 */
public class FlatMapMethod {
	
	public FlatMapMethod() {}
	
	public void FlatMapMethod() {
		
		System.out.println("hehe");
	}

	public static void main(String[] args) {
		/**
		 * limit
		 * skip
		 * concat
		 */
		new FlatMapMethod().FlatMapMethod();
		try(
		Stream<String> stream = Stream.of("adf","dgdgb","sdfgd");
		
		Stream<String> stream2 = stream.map((x)->x.toUpperCase());
		//peek产生和原始流一样的流，在每次取到一个元素时都会调用一下x->System.out.println(x)
		Stream<String> sss = Stream.of("adf","dgdgb","sdfgd").peek(x->System.out.println(x));
		//展开流，将一个流	展开放到另一个流中
		Stream<Character> s = sss.flatMap((x)->parse(x));
		
		) {
			s.forEach(System.out::println);
			System.out.println(stream == stream2);
			
		}
	}
	
	public static Stream<Character> parse(String s) {
		
		List<Character> list = new ArrayList<Character>();
		char[] c = s.toCharArray();
		
		for (char d : c) {
			list.add(d);
		}
		
		return list.stream();
	}

}
