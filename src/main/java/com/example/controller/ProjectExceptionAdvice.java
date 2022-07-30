package com.example.controller;

import com.example.exception.BusinessException;
import com.example.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author bz_c
 * @version 1.0
 * 处理项目中抛出的异常(异常拦截器)
 */
@RestControllerAdvice  // REST风格开发
public class ProjectExceptionAdvice {

    /**
     * 系统级的异常
     */
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex) {
        // 记录日志
        // 发送消息给运维
        // 发送数据给开发人员
        // 返回消息
        return new Result(null, ex.getCode(), ex.getMessage());
    }

    /**
     * 业务级的异常
     */
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex) {
        return new Result(null, ex.getCode(), ex.getMessage());
    }

    /**
     * 发生未知异常
     */
    @ExceptionHandler(Exception.class)  // 异常处理器，处理全部的异常(异常拦截器)
    public Result doException(Exception ex) {
        return new Result(null, Code.UNKNOWN_ERR, "发生了未知错误");
    }
}
