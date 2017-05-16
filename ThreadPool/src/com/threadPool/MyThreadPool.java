package com.threadPool;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyThreadPool {

	private List<Worker> threadPool = null;
	
	private CountDownLatch cdl = null;//用于确保线程都被挂起，主线程才能返回
	
	private ReentrantLock lock1 = new ReentrantLock();
	
	private ReentrantLock lock2 = new ReentrantLock();

	private int size = 5;

	public MyThreadPool() {
		this.threadPool = (new LinkedList<Worker>());
		cdl = new CountDownLatch(5);
		for (int i = 0; i < size; i++) {
			Worker worker = new Worker(this);
			threadPool.add(worker);
			Thread t = new Thread(worker);
			t.start();
			
		}
		try {
			cdl.await();//挂起，等待所有被创建的线程被挂机才能返回
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public MyThreadPool(int size) {
		this.size = size;
		this.threadPool = (new LinkedList<Worker>());
		cdl = new CountDownLatch(size);
		for (int i = 0; i < size; i++) {
			Worker worker = new Worker(this);
			threadPool.add(worker);
			Thread t = new Thread(worker);
			t.start();
		}
		try {
			cdl.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void execute(Runnable runnable) {
		
		lock1.lock();
		try{
			this.get().set(runnable);
			
		} finally {
			
			lock1.unlock();
			
		}
		
		
	}

	private void put(Worker worker) {
		lock2.lock();
		try{
			threadPool.add(worker);
			
		} finally {
			
			lock2.unlock();
			
		}
		
		
	}
	
	private Worker get() {
		if(threadPool.isEmpty()) {
			
			throw new RuntimeException("线程池当前为空");
			
		}
		return threadPool.remove(0);
		
	}

	private class Worker implements Runnable {
		
		private MyThreadPool pool = null;
		
		private Runnable work = null;
		
		private ReentrantLock lock = new ReentrantLock();
		
		private Condition condition = lock.newCondition();
		
		public Worker(MyThreadPool pool) {
			
			this.pool = pool;
		}
		

		@Override
		public void run() {
			boolean flag = true;
			try {
			lock.lock();
				while (flag) {
					cdl.countDown();
					condition.await();

					work.run();
					
					pool.put(this);
					
				
				
			}
			
			} catch (InterruptedException e) {
				e.printStackTrace();
				flag = false;
			} finally {
				
				lock.unlock();
			}
		}


		public void set(Runnable runnable) {
			
			lock.lock();
			
			try{
				this.work = runnable;
				condition.signal();
				
			}finally {
				
				lock.unlock();
			} 
			
			
			
		}

	}
	
	
}
