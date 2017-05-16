package com.optional;

import java.util.Optional;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 操作
 * @author Administrator
 *
 */
public class OptionalCreate {
	
	
	public static void main(String[] args) {
		
		Optional<String> optional = Optional.of("string");
		
		optional = Optional.empty();
		/**
		 * 如果参数是非null的，那么使用Optional.of()方法，如果是null，那么使用的是Optional.empty()方法。
		 */
		Optional.ofNullable("name");
		
		Optional.ofNullable(null);
		
		//optional.flatMap(mapper)
		
		Optional.empty().flatMap(x->{System.out.println(x); return null;});
		
		Optional.empty().map(x->{System.out.println(x); return null;});
		
		
		
		//optional.map(mapper)
		
		
		
		
	}

}
