/**
 * Copyright (c) 20095-2013 https://github.com/zhangkaitao
 *
 *
 */


package com.vita.erp.exception;

import org.springframework.core.NestedRuntimeException;

/**
 * Project_Name: smart-erp
 * File: SearchException
 * User: denghp
 * Date: 10/16/13
 * Time: 2:58 PM
 */
public class SearchException extends NestedRuntimeException {

    public SearchException(String msg) {
        super(msg);
    }

    public SearchException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
