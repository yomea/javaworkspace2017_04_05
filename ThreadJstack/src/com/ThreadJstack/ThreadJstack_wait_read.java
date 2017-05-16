package com.ThreadJstack;

import java.util.Scanner;

/**
 * vmargs jstack -l vmid
 * 
 * 可以看到这个线程仍然处于运行状态，但是检查到没有内容输入后，就会立即
 * 归还执行令牌，消耗比较少的cpu
 * 
 * java.lang.Thread.State: RUNNABLE
        at java.io.FileInputStream.readBytes(Native Method)
        at java.io.FileInputStream.read(FileInputStream.java:255)
        at java.io.BufferedInputStream.read1(BufferedInputStream.java:284)
        at java.io.BufferedInputStream.read(BufferedInputStream.java:345)
        - locked <0x00000000d5f59898> (a java.io.BufferedInputStream)
        at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:284)
        at sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:326)
        at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:178)
        - locked <0x00000000d6060658> (a java.io.InputStreamReader)
        at java.io.InputStreamReader.read(InputStreamReader.java:184)
        at java.io.Reader.read(Reader.java:100)
        at java.util.Scanner.readInput(Scanner.java:804)
        at java.util.Scanner.next(Scanner.java:1369)
        at com.ThreadJstack.ThreadJstack.main(ThreadJstack.java:13)
 * @author may
 *
 */
public class ThreadJstack_wait_read {
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		scanner.next();
		
	}

}
