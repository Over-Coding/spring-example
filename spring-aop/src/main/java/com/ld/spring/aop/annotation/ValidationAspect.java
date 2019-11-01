package com.ld.spring.aop.annotation;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ld
 * @create 2019年10月30日:下午7:44:30
 * @desc 验证切面
 */
@Component
@Aspect
@Order(-1)
public class ValidationAspect {

	/**
	 * 前置通知
	 * @param joinPoint 连接点信息
	 */
//	@Before("execution(* com.ld.spring.aop.annotation.CalculateService.*(..))")
	@Before("LoggingAspect.pointCut()")
	public void before(JoinPoint joinPoint) {
		//获取方法名称
		String name = joinPoint.getSignature().getName();
		//获取方法参数列表
		Object[] args = joinPoint.getArgs();
		System.out.println("ValidationAspect--->The method " + name + " before with args:" + Arrays.asList(args));
	}
}
