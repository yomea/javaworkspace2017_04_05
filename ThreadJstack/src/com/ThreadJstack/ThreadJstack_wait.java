package com.ThreadJstack;

/**
 * 这种就不会消耗cpu
 * java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x00000000d605c4c8> (a com.ThreadJstack.ThreadJstack_wait)
        at java.lang.Object.wait(Object.java:502)
        at com.ThreadJstack.ThreadJstack_wait.t(ThreadJstack_wait.java:24)
        - locked <0x00000000d605c4c8> (a com.ThreadJstack.ThreadJstack_wait)
        at com.ThreadJstack.ThreadJstack_wait.run(ThreadJstack_wait.java:16)
 * @author may
 *
 */
public class ThreadJstack_wait extends Thread {

	private static Object obj = new Object();

	public static void main(String[] args) throws Exception {

		ThreadJstack_wait tw = new ThreadJstack_wait();
		tw.start();
	}

	@Override
	public void run() {
		try {
			t();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void t() throws Exception {

		wait();

	}

}
