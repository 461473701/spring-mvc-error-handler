package org.hulan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 跳转到指定状态代码的页面
 * 404.html,500.html
 * 时间：2018-04-12
 * @author: zhaokuiqiang
 */
@Controller
@RequestMapping("/page")
public class ErrorPageController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/data")
	@ResponseBody
	public String data() {
		return "请求完成";
	}
	
	@RequestMapping("/dataex")
	@ResponseBody
	public String dataex() {
		throw new RuntimeException();
	}
	
	@RequestMapping("/ex")
	@ResponseBody
	public String ex() {
		throw new RuntimeException();
	}
}
