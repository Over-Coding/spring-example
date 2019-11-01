package com.ld.spring.bean.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author ld
 * @create 2019年10月31日:上午10:59:07
 * @desc person bean
 * bean级的生命周期接口
 * 1、BeanNameAware的setBeanName方法：用于设置beanName，作用于设置属性值之后，初始化方法之前
 * 2、BeanFactoryAware的setBeanFactory方法：调用setBeanName之后调用该方法设置BeanFactory，BeanFactory对象默认实现类是DefaultListableBeanFactory
 * 3、InitializingBean的afterPropertiesSet方法：在BeanPostProcessor.postProcessBeforeInitialization方法之后调用
 * 4、DisposableBean的destroy方法：用于销毁方法之前调用
 */
public class Person implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean{
	
	private String name;
	
	private int age;
	
	/**
	 * 构造方法
	 */
	public Person() {
		System.out.println("constraction===> 实例化");
	}
	
	/**
	 * 初始化方法
	 */
	public void initMethod() {
		System.out.println("initMethod===> 初始化方法");
	}
	
	/**
	 * 销毁方法
	 */
	public void destroyMethod() {
		System.out.println("destroyMethod===> 销毁方法");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName===> 设置name,name:" + name);
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge===> 设置age,age:" + age);
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	/**
	 * 设置beanName,用于设置属性之后，初始化方法之前
	 */
	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName===> 设置beanName,beanName:" + name);
	}

	/**
	 * 调用setBeanName之后调用该方法设置BeanFactory，BeanFactory对象默认实现类是DefaultListableBeanFactory
	 */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory===> 设置beanFactory,beanFactory:" + beanFactory);
	}

	/**
	 * 在BeanPostProcessor.postProcessBeforeInitialization方法之后调用
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet===>");
	}
	
	/**
	 *  用于销毁方法之前调用
	 */
	@Override
	public void destroy() {
		System.out.println("destroy===>");
	}
	
	
}
