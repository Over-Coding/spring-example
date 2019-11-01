package com.ld.spring.bean.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

/**
 * @author ld
 * @create 2019年10月31日:上午11:26:29
 * @desc 容器级的bean生命周期接口
   *     继承了InstantiationAwareBeanPostProcessorAdapter，
 * InstantiationAwareBeanPostProcessorAdapter实现了InstantiationAwareBeanPostProcessor接口：用于实例化bean前后和框架设置bean属性
 * 
 */
public class MyInstantiationAwareBeanPostProcessorAdapter extends InstantiationAwareBeanPostProcessorAdapter {

	/**
	 * 实例化前执行
	 * 注意：和postProcessBeforeInitialization方法不要搞混了，这个方法是初始化前执行
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInstantiation===> 实例化前，beanName:" + beanName);
		return super.postProcessBeforeInstantiation(beanClass, beanName);
	}

	/**
	 * 实例化后执行
	 * 注意：和postProcessAfterInitialization方法不要搞混了，这个方法是初始化后执行
	 */
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInstantiation===> 实例化后，beanName:" + beanName);
		return super.postProcessAfterInstantiation(bean, beanName);
	}
	
}
