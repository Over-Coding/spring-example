package com.ld.proxy.jdk.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import com.ld.proxy.jdk.service.CalculateService;

/**
 * @author ld
 * @create 2019年11月4日:下午1:47:38
 * @desc 
 * 使用getProxyClass获取代理对象
 * public static Class<?> getProxyClass(ClassLoader loader,
                                         Class<?>... interfaces)
   
 * 
 */
public class CalculateProxy2 {
	
	//目标对象
	private CalculateService target;
	
	public CalculateProxy2(CalculateService target) {
		this.target = target;
	}
	
	//获取代理对象
	@SuppressWarnings("unchecked")
	public Object getProxy() throws Exception {
		
		//代理对象
		Object proxy;
		
		/**
		 * 获取代理类的class对象
		 * 
		 * loader：ClassLoader对象。类加载器对象，用于加载动态生成的代理类。
		 * 
		 * interfaces：接口数组，提供目标对象的所有接口，目的是让代理对象保证与目标对象都有接口中相同的方法。
		 * 
		 */
		ClassLoader loader = target.getClass().getClassLoader();
		Class [] interfaces = target.getClass().getInterfaces();
		Class proxyClass = Proxy.getProxyClass(loader, interfaces);
		
		//获取代理类的构造器对象
		Constructor constructor = proxyClass.getDeclaredConstructor(InvocationHandler.class);
		
		//创建代理对象
		proxy = constructor.newInstance(new InvocationHandler() {

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
