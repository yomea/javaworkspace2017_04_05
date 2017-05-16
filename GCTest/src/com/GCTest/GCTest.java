package com.GCTest;

/**
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * 设置堆的大小为20M,不能扩展，新生代的大小为10M,Eden区和survivor的比例为8:1
 * 所以Eden区的大小为8M,from survivor区的大小为1M,to survivor区的大小为1M，老年代的大小为10M
 * 
 * 这个情况在JDK7以前好像不是一样的啊，没有了永久区，变成了Metaspace
 * 
 * Heap
 * PSYoungGen      total 9216K, used 7293K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 * eden space 8192K, 89% used [0x00000000ff600000,0x00000000ffd1f678,0x00000000ffe00000)
 * from space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
 * to   space 1024K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x00000000fff00000)
 * ParOldGen       total 10240K, used 4096K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 * object space 10240K, 40% used [0x00000000fec00000,0x00000000ff000010,0x00000000ff600000)
 * Metaspace       used 2661K, capacity 4486K, committed 4864K, reserved 1056768K
 * class space    used 288K, capacity 386K, committed 512K, reserved 1048576K
 * 
 * @author may
 *
 */
public class GCTest {
	
	private static int _size = 1024*1024;//1M
	
	public static void main(String[] args) {
		
		byte[] buff_1 = new byte[2*_size];
		
		byte[] buff_2 = new byte[2*_size];
		
		byte[] buff_3 = new byte[2*_size];//每个对象都是2M
		
		byte[] buff_4 = new byte[4*_size];//发生Minor GC，被分配到了老年代啊，JDK以前的会把Eden的存到老年代的，这个被分配到Eden区的
		
	}

}
