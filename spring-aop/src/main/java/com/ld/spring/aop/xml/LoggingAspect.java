package com.ld.spring.aop.xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

/**
 * @author ld
 * @create 2019年10月30日:下午6:57:06
 * @desc 日志切面
 */
public class LoggingAspect {

	/**
	 * 前置通知
	 * @param joinPoint 连接点信息
	 */
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
	public void afterThrowing(JoinPoint joinPoint,Exception e) {
		//获取方法名称
		String name = joinPoint.getSignature().getName();
		System.out.println("LoggingAspect--->The method " + name + " throw with exception:" + e);
	}
	
	/**
	 * 环绕通知
	 * @param joinPoint 连接点信息
	 */
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
