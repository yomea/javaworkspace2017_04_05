package com.javase8Diyizhang_2;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface Collection2<E> extends Collection<E> {
	
	
	default void forEachIf(Consumer<E> action, Predicate<E> filter) {
		
		Iterator<E> it = this.iterator();
		
		while(it.hasNext()) {
			
			E e = (E) it.next();
			
			if(filter.test(e)) {
				
				action.accept(e);
				
				
			}
			
		}
		
	}

}
