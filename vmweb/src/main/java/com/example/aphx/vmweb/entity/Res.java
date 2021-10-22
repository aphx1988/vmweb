package com.example.aphx.vmweb.entity;

public class Res<T> {
    T content;
    String msg;
    int code;

    public Res(T content, String msg, int code) {
        this.content = content;
        this.msg = msg;
        this.code = code;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
