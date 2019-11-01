package com.ld.spring.aop.xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

/**
 * @author ld
 * @create 2019年10月30日:下午7:44:30
 * @desc 验证切面
 */
public class ValidationAspect {

	/**
	 * 前置通知
	 * @param joinPoint 连接点信息
	 */
	public void before(JoinPoint joinPoint) {
		//获取方法名称
		String name = joinPoint.getSignature().getName();
		//获取方法参数列表
		Object[] args = joinPoint.getArgs();
		System.out.println("ValidationAspect--->The method " + name + " before with args:" + Arrays.asList(args));
	}
}
