package org.hulan.controller;

import org.hulan.exception.DataException;
import org.hulan.exception.PageException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * advice方式映射异常
 * 时间：2018-04-12
 * @author: zhaokuiqiang
 */
@Controller
@RequestMapping("advice")
public class ErrorAdviceController {

	@RequestMapping("data")
	public String data(){
		throw new DataException();
	}
	
	@RequestMapping("page")
	public String page(){
		throw new PageException();
	}
}
