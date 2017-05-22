package com.readdyjin.personal.model;

/**
 * Created by weidi.jin on 17-5-22.
 *
 * @author weidi.jin
 * @version 1.0
 */
public class ResponseObject {
    private static final int DEFAULT_FAILURE_STATUS = -1;
    private static final String DEFAULT_FAILURE_MSG = "Failure";

    private int status;
    private String msg;
    private Object data;

    public ResponseObject initCommonFailureStatus() {
        this.status = DEFAULT_FAILURE_STATUS;
        this.msg = DEFAULT_FAILURE_MSG;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public ResponseObject setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResponseObject setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ResponseObject setData(Object data) {
        this.data = data;
        return this;
    }
}
