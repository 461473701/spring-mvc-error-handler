package org.hulan.controller;

import org.hulan.exception.Exception404;
import org.hulan.exception.Exception500;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 抛出使用@ResponseStatus定义的异常
 * 自定义状态码
 * 时间：2018-04-12
 * @author: zhaokuiqiang
 */
@Controller
@RequestMapping("/status")
public class ErrorResponseStatusController {
	
	@RequestMapping("/dataex")
	@ResponseBody
	public String dataex() {
		throw new Exception404();
	}
	
	@RequestMapping("/ex")
	@ResponseBody
	public String ex() {
		throw new Exception500();
	}
}
