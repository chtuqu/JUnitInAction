package com.chtuqu.junit_in_action.ch3;

public interface Controller {
    Response processRequest(Request request);
    void addHandler(Request request, RequestHandler requestHandler);
}
