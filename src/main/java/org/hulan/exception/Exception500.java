package org.hulan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 时间：2018-04-12
 * @author: zhaokuiqiang
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class Exception500 extends RuntimeException{
}
