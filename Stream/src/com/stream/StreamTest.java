package com.stream;

import java.util.Arrays;

public class StreamTest {

	public static void main(String[] args) {
		
		String str = "sldjPagfUPYgjsd;ldP领导是否开工P建设a都很费劲；sdjfhsdjhPjs";
		
		String[] arrStr = str.split("\\P{L}+");//以非字母进行分割
		
		System.out.println(Arrays.toString(arrStr));
		
		//统计包含a字母的字符串的个数
		System.out.println(Arrays.asList(arrStr).stream().filter((s)->str.contains("a")).count());
		
		Arrays.asList(arrStr).parallelStream();//并行流
		
		
	}
	
}
