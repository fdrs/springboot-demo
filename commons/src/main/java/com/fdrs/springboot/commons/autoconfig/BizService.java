package com.fdrs.springboot.commons.autoconfig;

/**
 * Created by bruce.lch on 16/11/2017.
 */
public class BizService {

    private String msg;

    public String sayHello(){
        return "Hello"+ msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
