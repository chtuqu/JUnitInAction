package com.chtuqu.junit_in_action.ch3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestDefaultController {

    private DefaultController controller;
    private Request request;
    private RequestHandler requestHandler;

    @Before
    public void instantiate() throws Exception {
        controller = new DefaultController();
        request = new SampleRequest();
        requestHandler = new SampleHandler();

        controller.addHandler(request, requestHandler);
    }

    @Test
    public void testAddHandler() {
        RequestHandler requestHandler = controller.getHandler(request);
        assertSame("Handler we set in controller should be the same handler we get", this.requestHandler, requestHandler);
    }

    @Test
    public void testProcessRequest() {
        Response response = controller.processRequest(request);
        assertNotNull("Must not return a null response", response);
        assertEquals(new SampleResponse(), response);
    }

    @Test
    public void testProcessRequestAnswersErrorResponse() {
        Request request = new SampleRequest("testError");
        RequestHandler handler = new SampleExceptionHandler();
        controller.addHandler(request, handler);
        Response response = controller.processRequest(request);

        assertNotNull("Must not return a null response", response);
        assertEquals(ErrorResponse.class, response.getClass());
    }

    private class SampleRequest implements Request {

        private static final String DEFAULT_NAME = "Test";
        private String name;

        public SampleRequest(String name) {
            this.name = name;
        }

        public SampleRequest() {
            this(DEFAULT_NAME);
        }

        @Override
        public String getName() {
            return this.name;
        }
    }

    private class SampleHandler implements RequestHandler {
        @Override
        public Response process(Request request) throws Exception {
            return new SampleResponse();
        }
    }

    private class SampleExceptionHandler implements RequestHandler {
        @Override
        public Response process(Request request) throws Exception {
            throw new Exception("Error processing request");
        }
    }

    private class SampleResponse implements Response {

        private static final String NAME = "TEST";

        @Override
        public String getName() {
            return NAME;
        }

        public boolean equals(Object obj) {
            return obj instanceof SampleResponse && ((SampleResponse) obj).getName().equals(NAME);
        }

        public int hashCode() {
            return NAME.hashCode();
        }
    }

}
