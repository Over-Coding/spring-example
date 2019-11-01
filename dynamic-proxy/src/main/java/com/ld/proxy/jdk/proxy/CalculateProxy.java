package com.ld.proxy.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.ld.proxy.jdk.service.CalculateService;

/**
 * @author ld
 * @create 2019年11月1日:下午4:37:21
 * @desc jdk 动态代理
    *     动态代理的三要素：代理对象、目标对象、代理要做的工作
 * 
 * JDK的动态代理：
 * 	1、Proxy：是所有动态代理类的父类，专门用于生成代理类或者是代理对象
 *      ①：用于生成代理类的class对象
 * 		public static Class<?> getProxyClass(ClassLoader loader,
                                         Class<?>... interfaces)
        
 *      ②：用于生成代理对象
 *      public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
 * 
 * 2、InvocationHandler：完成动态代理的整个过程
 *    public Object invoke(Object proxy, Method method, Object[] args)
 * 
 */
public class CalculateProxy {
	
	//1、获取目标对象
	private CalculateService target;
	
	public CalculateProxy(CalculateService target) {
		this.target = target;
	}
	
	//2、生成代理对象，通过代理对象执行目标对象的工作
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

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				return null;
			}
		});
		return proxy;
	}

}
