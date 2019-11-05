package com.ld.proxy.cglib;

import com.ld.proxy.cglib.proxy.MyMethodInterceptor;
import com.ld.proxy.cglib.service.CalculateService;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author ld
 * @create 2019年11月4日:下午2:13:32
 * @desc 测试cglib动态代理
 */
public class Main {

	public static void main(String[] args) {
		// 代理类class文件存入本地磁盘方便我们反编译查看源码
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\proxy\\cglib");
        
        //通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        //设置enhancer对象的父类
        enhancer.setSuperclass(CalculateService.class);
        //设置enhancer的回调对象
        enhancer.setCallback(new MyMethodInterceptor());
        //创建代理对象
        CalculateService proxy = (CalculateService) enhancer.create();
        //通过代理对象调用目标方法
        int result = proxy.add(1, 2);
        System.out.println(result);
        
        //注意：类或者方法为final的修饰的没办法进行代理
        result = proxy.sub(2, 1);
        System.out.println(result);
		
	}
}
