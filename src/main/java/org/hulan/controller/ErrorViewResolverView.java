package org.hulan.controller;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义页面解析会覆盖默认的页面映射方式
 * 时间：2018-04-13
 * @author: zhaokuiqiang
 */
@Configuration
public class ErrorViewResolverView {
	@Bean
	public ErrorViewResolver errorViewResolver(){
		return (request, status, model) -> new ModelAndView("error/errorresolver",model);
	}
}
