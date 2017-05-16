package com.lambda.test;

import java.io.File;
import java.io.FileFilter;

public class FileFilterTest {
	
	public static boolean filter(File filename) {
		
		
		return filename.getName().endsWith(".class");
		
	}
	
	public static void main(String[] args) {
		File file = new File("C:/Users/Administrator/workspace/lambda/bin/com/lambda/test");
		
		 
		 
		//tranditional(file);
		
		methodRef(file);
		
		//lambda(file);
		
	}
	
	/**
	 * lambda的方式
	 * @param file
	 */
	public static void lambda(File file) {
		
		 File[] files = file.listFiles((pathname)->pathname.getName().endsWith(".class"));
			 
			 for (File file2 : files) {
				System.out.println(file2.getName());
			}
			 //没有捕获闭合域中的任何变量
			 file.list((File dir, String name)->!name.startsWith("."));
		
		
	}
	
	/**
	 * 方法引用的方式
	 */
	public static void methodRef(File file) {
		
		File[] files = file.listFiles(FileFilterTest :: filter);
		 
		 for (File file2 : files) {
			System.out.println(file2.getName());
		}
	
		
		
	}
	
	/**
	 * 传统的做法
	 * @param file
	 */
	public static void tranditional(File file) {
		
		 File[] files = file.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith(".class");
			}
			
			
			
		});
		 
		 for (File file2 : files) {
			System.out.println(file2.getName());
		}
		 
		
		
	}

}
