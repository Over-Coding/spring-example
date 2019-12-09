package com.ld.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ld
 * @create 2019年11月27日:下午3:51:33
 * @desc 
 */
@Controller
public class RestController {

	/**
	 * 新增
	 * @return
	 */
	@RequestMapping(value = "/user",method = RequestMethod.POST)
	public String add() {
		System.out.println("add ...");
		return "success";
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer id) {
		
		System.out.println("delete " + id + " ...");
		return "success";
	}
	
	/**
	 * 修改
	 * @return
	 */
	@RequestMapping(value = "/user",method = RequestMethod.PUT)
	public String update() {
		System.out.println("update ...");
		return "success";
	}
	
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
	public String query(@PathVariable("id") Integer id) {
		System.out.println("query " + id + " ...");
		return "success";
	}
	
	/**
	 * 查询所有用户
	 * @return
	 */
	@RequestMapping(value = "/users",method = RequestMethod.GET)
	public String queryAll() {
		System.out.println("queryAll ...");
		return "success";
	}
}
