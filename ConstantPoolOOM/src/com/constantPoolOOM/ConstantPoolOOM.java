package com.constantPoolOOM;

import java.util.ArrayList;
import java.util.List;

/**
 * JDK6,现在不支持了
 * -verbose -XX:PermSize=10M -XX:MaxPermSize=10M
 * @author may
 *
 */
public class ConstantPoolOOM {
	
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		int i = 0;
		
		for(;;) {
			
			list.add(String.valueOf(i++).intern());
			
		}
		
		
	}

}
