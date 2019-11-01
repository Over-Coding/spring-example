package com.ld.spring.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ld
 * @create 2019年10月30日:下午6:49:35
 * @desc 
 */
public class Main {
	
	public static void main(String[] args) {
		
		//加载配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:annotation-aop.xml");
		//获取service对象
		CalculateService calculateService = context.getBean("calculateService",CalculateService.class);
		//执行方法
		int add = calculateService.add(1, 2);
		
		int div = calculateService.div(1, 0);
	}

}
