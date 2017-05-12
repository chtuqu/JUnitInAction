package com.chtuqu.junit_in_action.ch3;

import java.util.HashMap;
import java.util.Map;

public class DefaultController implements Controller {

    private Map<String, RequestHandler> requestHandlers = new HashMap<>();

    protected RequestHandler getHandler(Request request) {
        if (!this.requestHandlers.containsKey(request.getName())) {
            throw new RuntimeException("Cannot find handler for request name [" + request.getName() + "]");
        }
        return this.requestHandlers.get(request.getName());
    }

    @Override
    public Response processRequest(Request request) {
        try {
            return getHandler(request).process(request);
        } catch (Exception ex) {
            return new ErrorResponse(request, ex);
        }
    }

    @Override
    public void addHandler(Request request, RequestHandler requestHandler) {
        if (this.requestHandlers.containsKey(request.getName())) {
            throw new RuntimeException("A request handler has already been registered for request name [" + request.getName() + "]");
        }
        this.requestHandlers.put(request.getName(), requestHandler);
    }
}
