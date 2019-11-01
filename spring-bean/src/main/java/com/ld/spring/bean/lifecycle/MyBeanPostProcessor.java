package com.ld.spring.bean.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author ld
 * @create 2019年10月31日:上午11:38:09
 * @desc 容器级的bean生命周期接口
 *      实现BeanPostProcessor接口，用于初始化方法前后使用，即init-method方法前后使用
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	/**
	 * 初始化前执行
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization===> 初始化前，beanName:" + beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	/**
	 * 初始化后执行
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization===> 初始化后，beanName:" + beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
}
