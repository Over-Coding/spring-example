package com.ld.proxy.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author ld
 * @create 2019年11月4日:下午1:47:17
 * @desc 创建通用的代理
 */
public class MyProxy {
	//1、获取目标对象
	private Object target;
	
	public MyProxy(Object target) {
		this.target = target;
	}
	
	//2、生成代理对象
	public Object getProxy() {
		
		//2.1、生成代理对象
		Object proxy;
		
		/**
		 * loader：ClassLoader对象。类加载器对象，用于加载动态生成的代理类。
		 * interfaces：接口数组，提供目标对象的所有接口，目的是让代理对象保证与目标对象都有接口中相同的方法。
		 * h：InvocationHandler类型的对象。
		 */
		ClassLoader loader = target.getClass().getClassLoader();
		
		Class [] interfaces = target.getClass().getInterfaces();
		
		proxy = Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {

			/**
			 * 代理对象调用代理方法，在其中调用目标对象的方法
			 * 
			 * proxy：代理对象，在invoke方法中一般不会使用
			 * 
			 * method：目标对象要被调用的方法对象
			 * 
			 * args：目标对象要被调用的方法的参数
			 * 
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				//获取方法名称
				String name = method.getName();
				
				//在方法调用前进行日志记录
				System.out.println("方法" + name + "传入参数为：" + Arrays.asList(args) + "，执行开始");
				
				//执行方法
				Object result = method.invoke(target, args);
				
				//在方法调用后进行日志记录
				System.out.println("方法" + name + "执行结果：" + result);
				return result;
			}
		});
		return proxy;
	}
}
