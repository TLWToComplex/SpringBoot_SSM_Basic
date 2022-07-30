package com.example.controller;

/**
 * @author bz_c
 * @version 1.0
 * 与前端进行交互的Result类
 */
public class Result {
    private Object data;  // 数据的传输
    private Integer code;  // 状态码
    private String message;  // 消息

    public Result() {
    }

    public Result(Object data, Integer code) {  // 不带消息
        this.data = data;
        this.code = code;
    }

    public Result(Object data, Integer code, String message) {  // 带消息
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "data=" + data +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
