package com.ld.proxy.jdk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ld.proxy.jdk.service.CalculateService;

/**
 * @author ld
 * @create 2019年11月1日:下午2:35:43
 * @desc 测试
 */
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:jdk-proxy.xml");
		//获取购买服务接口对象
		CalculateService service = context.getBean(CalculateService.class);
		
		int add = service.add(1, 2);
		System.out.println(add);
	}
}
