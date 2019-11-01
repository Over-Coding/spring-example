package com.ld.spring.aop.annotation;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ld
 * @create 2019年10月30日:下午6:57:06
 * @desc 日志切面
 */
@Component //表示是一个组件
@Aspect //表示是一个切面
@Order(2) //表示优先级，值越小，优先级越高
public class LoggingAspect {
	
	/**
	 * 声明切入点表达式
	 */
	@Pointcut("execution(* com.ld.spring.aop.annotation.CalculateService.*(..))")
	public void pointCut() {}
	

	/**
	 * 前置通知
	 * @param joinPoint 连接点信息
	 */
//	@Before("execution(* com.ld.spring.aop.annotation.CalculateService.*(..))")
	@Before("pointCut()")
	public void before(JoinPoint joinPoint) {
		//获取方法名称
		String name = joinPoint.getSignature().getName();
		//获取方法参数列表
		Object[] args = joinPoint.getArgs();
		System.out.println("LoggingAspect--->The method " + name + " before with args:" + Arrays.asList(args));
	}
	
	/**
	 * 后置通知
	 * @param joinPoint 连接点信息
	 */
//	@After("execution(* com.ld.spring.aop.annotation.Calculate*.*(..))")
	@After("pointCut()")
	public void after(JoinPoint joinPoint) {
		//获取方法名称
		String name = joinPoint.getSignature().getName();
		System.out.println("LoggingAspect--->The method " + name + " after");
	}
	
	/**
	 * 返回通知
	 * @param joinPoint 连接点信息
	 * @param result 返回值
	 */
//	@AfterReturning(value="execution(* com.ld.spring.aop.annotation.Calculate*.*(..))",returning="result")
	@AfterReturning(value="pointCut()",returning="result")
	public void afterReturning(JoinPoint joinPoint,Object result) {
		//获取方法名称
		String name = joinPoint.getSignature().getName();
		System.out.println("LoggingAspect--->The method " + name + " return with result:" + result);
	}
	
	/**
	 * 异常通知
	 * @param joinPoint 连接点信息
	 * @param e 异常对象
	 */
//	@AfterThrowing(value="execution(* com.ld.spring.aop.annotation.Calculate*.*(..))",throwing="e")
	@AfterThrowing(value="pointCut()",throwing="e")
	public void afterThrowing(JoinPoint joinPoint,Exception e) {
		//获取方法名称
		String name = joinPoint.getSignature().getName();
		System.out.println("LoggingAspect--->The method " + name + " throw with exception:" + e);
	}
	
	/**
	 * 环绕通知
	 * @param joinPoint 连接点信息
	 */
//	@Around("execution(* com.ld.spring.aop.annotation.Calculate*.*(..))")
//	public Object around(ProceedingJoinPoint joinPoint) {
//		//获取方法名称
//		String name = joinPoint.getSignature().getName();
//		//获取方法参数列表
//		Object[] args = joinPoint.getArgs();
//		//前置通知
//		System.out.println("LoggingAspect--->The method " + name + " before with args:" + Arrays.asList(args));
//		
//		Object result = null;
//		try {
//			//执行方法
//			result = joinPoint.proceed(args);
//			//返回通知
//			System.out.println("LoggingAspect--->The method " + name + " return with result:" + result);
//			return result;
//		} catch (Throwable e) {
//			//异常通知
//			System.out.println("LoggingAspect--->The method " + name + " throw with exception:" + e);
//		}finally {
//			//后置通知
//			System.out.println("LoggingAspect--->The method " + name + " after");
//		}
//		return null;
//	}
	
	
	
	
}
