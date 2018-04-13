package org.hulan.controller;

import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * spring错误属性设置功能
 * 如果使用@ControllerAdvice定义错误，errorAttributes不生效
 * 时间：2018-04-13
 * @author: zhaokuiqiang
 */
@Configuration
public class ErrorAttributesConfig {
	@Bean
	public ErrorAttributes errorAttributes(){
		return new ErrorAttributes() {
			@Override
			public Map<String,Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
				Map<String,Object> error = new HashMap<>();
				error.put("nowtime", System.currentTimeMillis());
				return error;
			}
			
			@Override
			public Throwable getError(WebRequest webRequest) {
				return null;
			}
		};
	}
}
