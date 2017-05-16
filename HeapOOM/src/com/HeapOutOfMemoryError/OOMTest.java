package com.HeapOutOfMemoryError;

import java.util.ArrayList;
import java.util.List;

/**
 * java.lang.OutOfMemoryError: Java heap space
 * -verbose -Xmx2M -Xms2M
 * @author may
 *
 */
public class OOMTest {
	
	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		
		for(; ;) {
			
			list.add(new Object());
		}
		
	}
	
}
