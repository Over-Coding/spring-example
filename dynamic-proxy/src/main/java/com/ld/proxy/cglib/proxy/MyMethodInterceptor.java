package com.ld.proxy.cglib.proxy;

import java.lang.reflect.Method;
import java.util.Arrays;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author ld
 * @create 2019年11月4日:下午2:16:48
 * @desc 自定义MethodInterceptor，实现MethodInterceptor接口
 */
public class MyMethodInterceptor implements MethodInterceptor {

	/**
	 * 方法拦截
	 * 
	 * obj：cglib生成的代理对象
	 * 
	 * method：目标对象要被调用的方法对象
	 * 
	 * args：目标对象要被调用的方法参数
	 * 
	 * MethodProxy：代理方法
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		//获取方法名称
		String name = method.getName();
		
		//在方法调用前进行日志记录
		System.out.println("方法" + name + "传入参数为：" + Arrays.asList(args) + "，执行开始");
		
		//执行方法
		Object result = proxy.invokeSuper(obj, args);
		
		//在方法调用后进行日志记录
		System.out.println("方法" + name + "执行结果：" + result);
		return result;
	}

}
