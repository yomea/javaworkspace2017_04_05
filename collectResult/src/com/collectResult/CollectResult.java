package com.collectResult;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectResult<T> {
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("s", "sg", "d", "3w4", "java", "html");
		
		HashSet<String> hashSet = stream.collect(HashSet::new, HashSet::add, HashSet::addAll);
		
		Stream.of("s", "sg", "d", "3w4", "java", "html").iterator();
		
		Stream.of("s", "sg", "d", "3w4", "java", "html").toArray();
		
		Stream.of("s", "sg", "d", "3w4", "java", "html").collect(Collectors.toCollection(TreeSet::new));
		
		IntSummaryStatistics IntSummaryStatistics = Stream.of("s", "sg", "d", "3w4", "java", "html").collect(Collectors.summarizingInt(x->x.length()));
		
		System.out.println(IntSummaryStatistics.getAverage());//计算平均值
		
		System.out.println(hashSet);
		
		
		System.out.println(Stream.of("s", "sg", "d", "3w4", "java", "html").collect(Collectors.joining("$")).toString());//以美元符号进行连接
		
		
		 List<String> list = Stream.of("s", "sg", "d", "3w4", "java", "html").collect(Collectors.toList());
		 
		 
		 List<Integer> list2 = getList();
		 
		 List<String> lissdft = (List<String>) listw();
		
	}
	
	public static <R> List<R> getList() {
		
		
		return new ArrayList<R>();
		
	}
	
public static  List<?> listw() {
		
		
		return new ArrayList<String>();
		
	}

}
