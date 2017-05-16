package com.class_;

public class Test {
	public void print(int age) {//局部变量表的长度为2，为什么为2呢，因为在字节码中还用一个隐藏的变量this，所以我们平时使用的this是从外边传进来的

		int a = age;

		a++;

		}

}
