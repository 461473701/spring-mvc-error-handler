package org.hulan.controller;

import org.hulan.exception.DataException;
import org.hulan.exception.PageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 使用advice方式定义错误
 * 时间：2018-04-12
 * @author: zhaokuiqiang
 */
@ControllerAdvice(basePackageClasses = ErrorAdviceController.class)
public class ErrorAdvice {
	
	@ExceptionHandler(DataException.class)
	@ResponseBody
	public ResponseEntity handlerDataException(HttpServletRequest request, Throwable throwable) {
		HttpStatus status = getStatus(request);
		Map map = new HashMap();
		map.put("a","b");
		map.put("b",status.value());
		return new ResponseEntity(map, status);
	}
	
	@ExceptionHandler(PageException.class)
	public String handlerPageException(HttpServletRequest request, Throwable throwable) {
		return "error/error";
	}
	
	private HttpStatus getStatus(HttpServletRequest request) {
		Integer statusCode = (Integer) request.getAttribute(WebUtils.ERROR_STATUS_CODE_ATTRIBUTE);
		if(statusCode == null) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return HttpStatus.valueOf(statusCode);
	}
}
