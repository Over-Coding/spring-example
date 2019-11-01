package com.ld.spring.bean.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ld
 * @create 2019年10月31日:上午11:05:23
 * @desc 测试bean的生命周期
 */
public class Main {

	public static void main(String[] args) {
		//加载配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:lifecycle-bean.xml");
		//获取bean对象
//		Person person = context.getBean("person", Person.class);
//		
//		System.out.println(person);
		
		//关闭容器
		context.close();
	}
}
