package com.sang.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(value = {"code","message","data"})
public class Result {

    @JsonProperty("code")
    private int code = 0;


    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private Object data;

    public Result() {
    }

    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result getResult(int code, String message) {
        return getResult(code, message, null);
    }

    public static Result getResult(int code, String message, Object data) {
        return new Result(code, message, data);
    }

    public static Result success() {
        return success(null);
    }

    public static Result success(Object data) {
        return success("success!!", data);
    }

    public static Result success(String message, Object data) {
        return new Result(0, message, data);
    }

    public static Result fail() {
        return fail(null);
    }

    public static Result fail(Object data) {
        return fail("服务器错误", data);
    }

    public static Result fail(String message, Object data) {
        return new Result(-1, message, data);
    }




    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Info{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}