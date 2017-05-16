
package com.lambda.test;

import com.lambda.Lambda_arg;


/**
 * 如果一个方法已经有其他的方法实现了，那么可以使用方法引用
 * System.out::println等同于x->System.out.print(x);
 * 
 * Math::pow等用于（x, y）-> Math.pow(x, y);
 * 
 * 
 * 类名：：（静态或实例）方法名
 * 对象：：方法名
 * 类名 ：： new
 * 对象 ：：new
 * 
 * 如果存在重载的方法怎么办，比如Math::max,它有重载的方法。没有关系，lambda会自动根据函数定义的参数类型找到最合适的方法进行引用
 * 
 * 
 * @author Administrator
 *
 */

public class Lambda_method_ref_Test {
	
	
	public static void main(String[] args) {
		
		Lambda_arg lambda = System.out::println;
		
		
		lambda.printSomeInfo("hello lambda");
		
		
		
	}

}
