package com.chinasoft.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinasoft.pojo.Person;

public class MyTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml" );
		Person person  = (Person) context.getBean("person");
		person.sing();
	}
}
