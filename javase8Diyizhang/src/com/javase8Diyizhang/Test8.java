package com.javase8Diyizhang;

import java.util.ArrayList;
import java.util.List;

public class Test8 {

	public static void main(String[] args) {

		List<Runnable> list = new ArrayList<>();

		List<Runnable> list2 = new ArrayList<>();

		String[] str = { "a", "b", "c" };

		for (String string : str) {

			list.add(() -> System.out.println(string));

		}
		
		for (int i = 0; i < str.length; i++) {
			//list2.add(() -> System.out.println(str[i]));//这种方式会报错，这个i发生了改变，不属于不变局部变量的范畴。
			//这种方式在其他的语言中，如js是合法的，但是后果就是最后拿到的值全是最后一个元素

		}

		for (int i = 0; i < str.length; i++) {
			int j = i;//为了解决上面的问题，这里定义一个局部变量j，可以肯定的是这个j初始化后就不会再变了，只能在下一次循环时被销毁
			//总而言之，一个被闭包使用的局部变量必须保证是final的，虽然可以不用显示声明为final
			list2.add(() -> System.out.println(str[j]));//这种方式会报错，这个i发生了改变，不属于不变局部变量的范畴。
		}

		// a b c
		for (Runnable r : list) {
			r.run();
		}
		
		for (Runnable r : list2) {
			r.run();
		}


	}

}
