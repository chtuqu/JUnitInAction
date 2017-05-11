package com.chtuqu.junit_in_action.ch3;

public interface RequestHandler {
    Response process(Request request) throws Exception;
}
