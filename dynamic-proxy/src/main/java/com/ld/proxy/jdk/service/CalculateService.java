package com.ld.proxy.jdk.service;
/**
 * @author ld
 * @create 2019年11月1日:下午3:34:46
 * @desc 购买服务接口
 */
public interface CalculateService {
	
    /**
	 * 加法计算
	* @param one
	* @param two
	* @return
	*/
	public int add(int one,int two);

	/**
	     * 减法计算
	* @param one
	* @param two
	* @return
	*/
	public int sub(int one,int two);

	/**
	     * 乘法计算
	* @param one
	* @param two
	* @return
	*/
	public int mul(int one,int two);

	/**
	     * 除法计算
	* @param one
	* @param two
	* @return
	*/
	public int div(int one,int two);
	
}
