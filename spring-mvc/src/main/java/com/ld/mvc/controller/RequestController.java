package com.ld.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ld
 * @create 2019年11月27日:下午4:13:32
 * @desc 
 */
@Controller
public class RequestController {

	/**
	 * 测试 @RequestParam
	 * @param id
	 * @param name
	 * @return
	 */
	@RequestMapping("/testRequestParam")
	public String testRequestParam(@RequestParam(value = "id",defaultValue = "11") String id,String name) {
		System.out.println("id:" + id + " name:" + name);
		return "success";
	}
	
	/**
	 * 测试 @RequestHeader
	 * @param acceptLanguage
	 * @return
	 */
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(@RequestHeader("Accept-Language") String acceptLanguage) {
		System.out.println("Accept-Language:" + acceptLanguage);
		return "success";
	}
	
	/**
	 * 测试 @CookieValue
	 * @param acceptLanguage
	 * @return
	 */
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID") String sessionId) {
		System.out.println("JSESSIONID:" + sessionId);
		return "success";
	}
}
