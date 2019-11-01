package com.ld.spring.aop.annotation;

import org.springframework.stereotype.Service;

/**
 * @author:ld
 * @create:2019-10-30 14:28
 * @description: 计算服务类
 */
@Service
public class CalculateService {

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
