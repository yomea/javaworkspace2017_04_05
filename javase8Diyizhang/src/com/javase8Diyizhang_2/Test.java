package com.javase8Diyizhang_2;

public class Test<E> extends Collection2Impl<E> {
	
	
	private static final long serialVersionUID = 9030652525948060356L;

	public static void main(String[] args) {
		
		Test<String> test = new Test<>();
		
		test.add("java");
		test.add("jsp");
		test.add("c++");
		test.add("asp");
		test.add("javascript");
		test.add("php");
		
		
		test.forEachIf((str)->System.out.println(str), (str)->str.contains("a"));
		
		
	}

}
