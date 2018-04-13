package org.hulan.controller;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

/**
 * 未使用spring mvc的错误页面映射方式
 * 时间：2018-04-13
 * @author: zhaokuiqiang
 */
//@Configuration
public class ErrorPageRegister {
	@Bean
	public ErrorPageRegistrar errorPageRegistrar(){
		return registry -> registry.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST,"/500"));
	}
}
