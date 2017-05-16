package com.jiekouchongtu2;

/**
 * 如果两个接口存在相同方法名，相同参数，但是其中一个是default方法，另一个
 * 是抽象方法，那么在实现类中需要对方法进行覆盖
 * 
 * @author Administrator
 *
 */
public class Test implements Test_2, Test_1 {

	@Override
	public void print() {
		
		Test_2.super.print();
		
	}

	
}
