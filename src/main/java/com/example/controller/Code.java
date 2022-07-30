package com.example.controller;/**
 * @author bz_c
 * @version 1.0
 * 识别的符号、代表不同的操作是否是成功的，区分都返回true的操作
 */
public class Code {

    public static final Integer SAVE_OK = 20011;

    public static final Integer DELETE_OK = 20021;

    public static final Integer UPDATE_OK = 20031;

    public static final Integer SELECT_OK = 20041;

    public static final Integer SAVE_ERR = 20010;

    public static final Integer DELETE_ERR = 20020;

    public static final Integer UPDATE_ERR = 20030;

    public static final Integer SELECT_ERR = 20040;

    public static final Integer SYSTEM_ERR = 50001;

    public static final Integer BUSINESS_ERR = 50002;

    public static final Integer UNKNOWN_ERR = 59999;
}
