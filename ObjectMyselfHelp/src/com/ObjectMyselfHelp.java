package com;

/**
 * 同一个对象的finalize方法最多只能执行一次
 * @author may
 *
 */
public class ObjectMyselfHelp {

	private static ObjectMyselfHelp ref = null;

	public static void main(String[] args) throws InterruptedException {

		ref = new ObjectMyselfHelp();

		ref = null;

		System.gc();

		System.runFinalization();

		Thread.sleep(1000);//由于finalizer线程的执行权限太低，所以等下。

		if (ref != null) {

			System.out.println("我活了。。。");//我活了。。。

		} else {

			System.out.println("我死了。。。");
		}
		
		ref = null;

		System.gc();

		System.runFinalization();

		Thread.sleep(1000);

		if (ref != null) {

			System.out.println("我活了。。。");

		} else {

			System.out.println("我死了。。。");//我死了。。
		}

	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize is executed...");
		ref = this;
	}

}
