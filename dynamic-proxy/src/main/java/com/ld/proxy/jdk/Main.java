package com.ld.proxy.jdk;

import com.ld.proxy.jdk.proxy.CalculateProxy;
import com.ld.proxy.jdk.proxy.CalculateProxy2;
import com.ld.proxy.jdk.proxy.MyProxy;
import com.ld.proxy.jdk.service.CalculateService;
import com.ld.proxy.jdk.service.CalculateServiceImpl;


/**
 * @author ld
 * @create 2019年11月1日:下午2:35:43
 * @desc 测试jdk动态代理
 */
public class Main {

	public static void main(String[] args) throws Exception {
		// 代理类class文件存入本地磁盘方便我们反编译查看源码
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		
		//创建目标对象
		CalculateServiceImpl target = new CalculateServiceImpl();
		
		//获取代理对象
//		CalculateService proxy = (CalculateService) new CalculateProxy(target).getProxy();
//		CalculateService proxy = (CalculateService) new CalculateProxy2(target).getProxy();
		//通用的代理
		CalculateService proxy = (CalculateService)new MyProxy(target).getProxy();
		
		//执行方法
		int result = proxy.add(1, 2);
		System.out.println(result);

	}
}
