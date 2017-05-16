package com.test;

import java.util.Enumeration;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.controller.User;

public class UserTest {
	
	
	
	@Test
	public void test() throws Exception {
		
		@SuppressWarnings("resource")
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("classpath*:spring/spring-*.xml");
		
		User user = beanFactory.getBean("user", User.class);
		
		String username = user.getName();
		
		
		/*System.out.println(username);
		
		Enumeration<java.net.URL> en = this.getClass().getClassLoader().getResources("spring/spring-context.xml");
		
		while(en.hasMoreElements()) {
			
			System.out.println(en.nextElement().getFile());
			
		}
		*/
	}
	

}
