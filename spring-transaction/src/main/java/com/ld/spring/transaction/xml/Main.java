package com.ld.spring.transaction.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ld
 * @create 2019年10月31日:下午4:53:01
 * @desc 测试注解事务
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:xml-tx.xml");
		//获取服务bean
		BuyService service = context.getBean("buyService",BuyService.class);
		//执行购买
		service.buy(1, 1);
	}
}
