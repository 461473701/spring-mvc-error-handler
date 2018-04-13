package org.hulan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 时间：2018-04-12
 * @author: zhaokuiqiang
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class Exception404 extends RuntimeException{
}
