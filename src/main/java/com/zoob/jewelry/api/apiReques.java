package com.zoob.jewelry.api;

public class apiReques {
    private Integer code;
    private Object data;

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public apiReques(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }
}
