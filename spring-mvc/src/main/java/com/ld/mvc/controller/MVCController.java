package com.ld.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ld
 * @create 2019年11月27日:下午1:57:52
 * @desc 
 */
@Controller
public class MVCController {

	@RequestMapping("/hello")
	public String hello() {
		
		return "success";
	}
	
	@RequestMapping("/testRedirect")
	public String testRedirect() {
		
		return "redirect:/www.baidu.com";
	}
}
