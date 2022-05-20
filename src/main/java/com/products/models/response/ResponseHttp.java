package com.products.models.response;

public class ResponseHttp<T> {
    
    private String message;
    private T data;
    private int code;

    public ResponseHttp() {}
    
    public ResponseHttp(String message, T data, int code) {
        this.message = message;
        this.data = data;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

}
