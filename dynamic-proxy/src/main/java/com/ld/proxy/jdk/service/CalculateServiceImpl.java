package com.ld.proxy.jdk.service;

import org.springframework.stereotype.Service;

/**
 * @author ld
 * @create 2019年11月1日:下午4:26:59
 * @desc 
 */
@Service
public class CalculateServiceImpl implements CalculateService{

	/**
	     * 加法计算
	* @param one
	* @param two
	* @return
	*/
	public int add(int one,int two){
		int result = one + two;
		return result;
	}

	/**
	     * 减法计算
	* @param one
	* @param two
	* @return
	*/
	public int sub(int one,int two){
		int result = one - two;
		return result;
	}

	/**
	     * 乘法计算
	* @param one
	* @param two
	* @return
	*/
	public int mul(int one,int two){
		int result = one * two;
		return result;
	}

	/**
	     * 除法计算
	* @param one
	* @param two
	* @return
	*/
	public int div(int one,int two){
		int result = one / two;
		return result;
	}

}
