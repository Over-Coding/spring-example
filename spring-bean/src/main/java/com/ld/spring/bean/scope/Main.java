package com.ld.spring.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ld
 * @create 2019年10月31日:下午1:07:55
 * @desc 测试bean的作用域
 */
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//加载配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:scope-bean.xml");
		
		//获取bean对象
		Person person1 = context.getBean("person",Person.class);
		
		//获取bean对象
		Person person2 = context.getBean("person",Person.class);
		
		System.out.println(person1 == person2);
	}
}
