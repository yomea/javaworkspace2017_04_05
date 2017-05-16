package com.lambda.test;

import com.lambda.IConstruct;
import com.lambda.IConstruct2;

/**
 * 函数式编程，在给一个函数式接口提供实现时，对方法的引用，首先检查参数类型是否相同，返回类型是否相同，如果都满足，不会报错
 * 
 * 被引用的方法的参数类型可以是接口方法的父类，返回类型可以是接口方法的的子类,接口方法的返回类型可以是void
 * 
 * @author Administrator
 *
 */
public class Construct_test {

	public Construct_test() {

	}

	public Construct_test(Object string) {
		System.out.println(string);
		
		return ;
	}
	//返回类型可以是接口方法的的子类,参数类型可以是接口方法的父类
	public String test(Object string) {
		System.out.println(string);
		
		return null;
	}
	
	
	public static void main(String[] args) {
		
		IConstruct c = Construct_test :: new;
		
		Construct_test ct = new Construct_test();
		
		IConstruct2 c2 = ct::test;
		
		c.printSomeInfo("hello");
		
	}

}
