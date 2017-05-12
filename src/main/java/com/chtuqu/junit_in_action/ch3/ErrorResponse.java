package com.chtuqu.junit_in_action.ch3;

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

    @Override
    public String getName() {
        return null; // TODO fix it
    }
}
