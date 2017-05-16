package com.collectResult;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectResultMap {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		
		
		Locale locale;
		
		Stream<Locale> stream = Stream.of(Locale.getAvailableLocales());
		
		Map<String, String> map = stream.collect(Collectors.toMap(x->x.getDisplayName(), x->x.getDisplayLanguage()));
		
		//Stream.of(Locale.getAvailableLocales()).collect(Collectors.toConcurrentMap(keyMapper, valueMapper))
		Stream.of(Locale.getAvailableLocales()).collect(Collectors.toMap(x->x.getDisplayName(), Function.identity()));
		
		//mergeFunction 的意思就是，将键相同的两个的值进行合并，如长度为3的有dsf 和 sde ，那么dsf和sde会传到merge函数中进行合并
		TreeMap<String, String> treeMap = Stream.of("dsfg","dsf","eryyg", "sde").collect(Collectors.toMap(x->String.valueOf(x.length()), x->String.valueOf(x.charAt(0)),(x,y)->{System.out.println(x + "--" + y);return x+y;},TreeMap::new));
		
		
		Function valueMapper = null;
		Stream.of("dsfg","dsf","eryyg", "sde").collect(Collectors.toMap(new Function<String, String>() {

			@Override
			public String apply(String t) {
				// TODO Auto-generated method stub
				return null;
			}
		}, valueMapper));
		
		System.out.println(treeMap);
		
	}
	
}
