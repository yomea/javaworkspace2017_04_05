package com.lambda.test;

/**
 * 含有自由变量的代码块叫做闭包
 * 所谓自由变量，就是在这个代码块中不是这个代码块中的参数也不是在这个代码块中定义的变量
 * 不过java中对于闭包中的自由变量有个约束，那就是自由变量的值不能被改变,
 * 
 * 为什么不能改变，虽然lambda或者内部类会有这个自由变量的拷贝（外部的局部变量在方法结束后消失，为了保存他们的值
 * 采用了这种方式），但是语义以及本意上表示的就是
 * 外部的局部变量，如果给这个lambda表达式创建多线程同是访问，加入修改自由变量是合法的，并且我们给它增加了线程安全代码块
 * 那按照之前的逻辑，这些自由变量是独立存在的（每个lambda表达式都存在一份变量的拷贝），
 * 那么这些个变量并不是共享的。这就给人一种错觉，我明明改变的都是count这个变量，为啥他就
 * 没有改变呢？？？所以局部变量是不可变的。所以这个局部变量必须保证不会发生改变，基础类型的值不变，
 * 引用类型的引用地址不变（引用的对象内的属性可以改变）
 * 
 * lambda表达式中的this和super均表示外部的这个类的this和super
 * public class Test {
 * 		public void test() {
 * 			new Thread(()->{
 * 				System.out.println(this.toString());//这个this指的是Test这个类的实例
 * 	为什么呢，因为lambda的作用域被嵌套在了test()方法中
 * 
 * 			}).start();
 * 
 * 		}
 * }
 * 
 * 
 * 这里的count和text就是闭包
 * @author Administrator
 *
 */
public class Closure {

	public static void main(String[] args) {
		Closure.print(1000, "hello world");
	}

	/**
	 * print方法已经调用完成了，count，text变量应该已经失效了才对，为什么。。。
	 * 因为lambda表达式，会自动封装成一个类的对象，这些变量值变成了这个类的成员变量
	 * 匿名内部类也是这种实现原理
	 * @param count
	 * @param text
	 */
	public static void print(int count, String text) {
		//count和text在lambda这个代码块中既不是参数也不是定义的变量。所以他们是自由变量
		new Thread(() -> {
			
				//count = 0;//这个值不能被改变
			
			for (int i = 0; i < count; i++) {
				
				System.out.println(text);

			}
			
		}).start();

	}

}
