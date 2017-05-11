package com.chtuqu.junit_in_action.ch3.impl;

import com.chtuqu.junit_in_action.ch3.Request;
import com.chtuqu.junit_in_action.ch3.Response;

public class ErrorResponse implements Response {

    private Request originalRequest;
    private Exception originalException;

    public ErrorResponse(Request originalRequest, Exception originalException) {
        this.originalRequest = originalRequest;
        this.originalException = originalException;
    }

    public Request getOriginalRequest() {
        return originalRequest;
    }

    public Exception getOriginalException() {
        return originalException;
    }
}
