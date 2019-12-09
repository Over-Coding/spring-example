package com.ld.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ld
 * @create 2019年11月29日:下午5:20:38
 * @desc 
 */
@Controller
public class JsonController {

	@RequestMapping("/testJson")
	@ResponseBody
	public List<String> testJson(@RequestBody List<String> list){
		
		list.add("1");
		list.add("11");
		list.add("111");
		list.add("1111");
		System.out.println("testJson 。。。");
		return list;
	}
}
