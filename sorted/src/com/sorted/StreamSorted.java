package com.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * 对流进行排序，所以你无法读一个无限的流进行排序
 * 一个流使用了终止方法后，就不能再次使用了
 * @author Administrator
 *
 */
public class StreamSorted<T> {
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("root", "admin", "admin");
		
		Stream<String> streamSorted = stream.sorted();
		
		//compareTo是个动态方法，它在动态方法中接受一个参数，这里的函数式方法接受的是两个参数
		//使用：：域运算符静态调用这个方法，会把动态方法变成静态的方法来使用。
		//静态方法内部是不能使用this关键字的，动态方法中可以使用this，那是因为底层是将this传进方法里去了，实际是this
		//就是个形参，如compareTo(T arg)在底层是compareTo(this, T arg);
		//那么使用域运算符静态调用后就变成了连个参数的了，符合Comparator接口的方法定义了
		Stream<String> streamSorted2 = Stream.of("root", "admin", "admin").sorted(String::compareTo);
		
		//Comparator.comparing((x)->x.length())返回一个用字符长度进行比较的比较器
		Stream<String> streamSorted3 = Stream.of("root", "admin", "admin").sorted(Comparator.comparing((x)->x.length()));
		
		Stream<String> streamSorted4 = Stream.of("root", "admin", "admin").sorted(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
			
			
			
		});
		
		System.out.println(Arrays.toString(streamSorted.toArray()));
		
		
	}
	

}
