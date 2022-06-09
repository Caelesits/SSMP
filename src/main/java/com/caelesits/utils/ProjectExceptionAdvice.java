package com.caelesits.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Caelesits
 * @create 2022/6/9 11:03
 **/

//作为SpringMVC的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //拦截所有异常信息
    @ExceptionHandler
    public R doException(Exception e) {
        //记录日志
        //通知运维
        //通知开发
        e.printStackTrace();
        return new R("服务器故障，请稍后再试！");
    }
}
