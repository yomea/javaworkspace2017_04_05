package com.jiekouchongtu;

/**
 * 如果两个接口都存在相同名称，相同参数的默认方法，这个时候需要重写这个方法，并且选取其中一个接口的default的方法
 * 
 * @author Administrator
 *
 */
public class Test implements Test_2, Test_1 {

	static void t(){};
	
	@Override
	public void print() {
		
		Test_1.super.print();//这里选择了Test_1的default方法。
	}
	
	public static void main(String[] args) {
		
		Test test = new Test();
		//test.p();子类是不会继承父类的静态方法的
		//test.t();
		
	}

}
