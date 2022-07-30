package com.example.exception;

/**
 * @author bz_c
 * @version 1.0
 * 业务异常
 */
public class BusinessException extends RuntimeException{   // 可以自动向上抛异常(省去Throw操作)

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public BusinessException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

}
