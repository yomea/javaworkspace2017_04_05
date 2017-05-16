package com.test;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class Test {
	
	public class Son extends Father {
		
		@Override
		public void think() {
			/**
			 * 
			 * 模拟JVM的动态单分派
			 * Parameters:
			 * rtype the return type
			 * ptypes the parameter types
			 * Returns:a method type with the given components
			 */
			//类似是写方法的描述符
			MethodType mt = MethodType.methodType(void.class);
			
			//MethodType.fromMethodDescriptorString(descriptor, loader)
			
			MethodHandle mh = null;
			try {
				mh = MethodHandles.lookup().findSpecial(GrandFather.class, "think", mt, getClass());
				mh.invoke(this);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		
			
		}

	}
	
	public class GrandFather {
		
		
		public void think() {
			
			System.out.println("I am grandFather!!!");
			
		}

	}
	
	public class Father extends GrandFather {
		
		@Override
		public void think() {
			System.out.println("I am father!!!");
		}

	}
	
	public static void main(String[] args) throws Throwable {
		
		Son son = new Test().new Son();
		
		
		son.think();
		
	}

}
