package com.jiekouchongtu4;

/**
 * 如果继承的类中的一个方法的方法名和参数和这个类实现的Test_1接口中的default方法一样的，那么
 * 这个接口default方法被忽略。
 * 
 * 类优先规则
 * 
 * @author Administrator
 *
 */
public class Test extends Test_2 implements Test_1 {
	
	
	public static void main(String[] args) {
		
		Test test = new Test();
		
		test.print();//this is Test_2's  method它只继承了Test_2这个类的方法
		
	}


	
}
