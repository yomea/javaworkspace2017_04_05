package com.foreach;

import java.util.stream.Stream;

public class Foreach {
	
	
	public static void main(String[] args) {
		
		
		Stream<String> stream = Stream.of("dfg", "dfg", "wet", "aset", "php");
		
		//peek的时候并不会执行，只有进行其他的方法操作时才开始执行
		stream.peek(x->System.out.println(x)).findFirst();
		
		//forEachOrdered可以保证当前的顺序
		Stream.of("dfg", "dfg", "wet", "aset", "php").forEachOrdered(x->System.out.println(x));
		
	}
	

}
