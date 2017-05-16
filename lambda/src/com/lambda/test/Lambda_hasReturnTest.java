package com.lambda.test;

import com.lambda.Lambda_hasRetrun;

public class Lambda_hasReturnTest {
	
	
	public static void main(String[] args) {
		
		//str->{return str += " lambda";}或者str->str += " lambda"
		Lambda_hasRetrun lambda = (String str)->{return str += " lambda";};//或者(str)->{return str += " lambda";}因为lambda是可以推导出你需要什么养的类型
		
		String str = lambda.printSomeInfo("hello");
		
		
		System.out.println(str);
	}

}
