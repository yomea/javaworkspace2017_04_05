package com.aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * max
 * min
 * count
 * avg
 * findFirst
 * findAny 找到任意一个就停止查找，在并行下最高效
 * allMatcher
 * noneMatcher
 * @author Administrator
 *
 */
public class Aggregate2 {
	
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("hello", "world", "hello", "java", "hello", "php", "jsp", "javascript");
		
		 Optional<String> optional = stream.max((x,y)->x.length()>y.length()?1:x.length()==y.length()?0:-1);
		 
		 
		 //Stream.of("hello", "world", "hello", "java", "hello", "php", "jsp", "javascript").parallel().anyMatch();
		 
		 //optional.isPresent()如果这个optional有值，那么就会返回true
		 
		 List<String> list = new ArrayList<>();
		 
		 optional.ifPresent(x->list.add(x));
		 
		 optional.ifPresent(list::add);
		 
		 optional.orElse("defaultValue");//如果当前值不存在，就返回默认值
		 
		 optional.orElseGet(()->"hello");
		 //这个构造器底层存在返回值吗？？？
		 optional.orElseThrow(NoSuchElementException::new);//没有值的时候会跑出异常
		 
		System.out.println(optional.get());
		/*stream.max(new Comparator<T>() {
		});
		*/
		
	}

}
