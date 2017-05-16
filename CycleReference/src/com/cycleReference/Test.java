package com.cycleReference;

import java.util.concurrent.locks.LockSupport;
/**
 * 同样还是会被回收，所以不是计算引用算法
 * @author may
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		Reference ref_1 = new Reference();
		
		Reference ref_2 = new Reference();
		
		
		ref_1.ref = ref_2;
		
		ref_2.ref = ref_1;
		
		System.gc();
		
		System.runFinalization();
		
		LockSupport.park();
		
	}

}
