package com.chtuqu.junit_in_action.ch3;

import com.chtuqu.junit_in_action.ch3.impl.DefaultController;
import org.junit.Before;
import org.junit.Test;

public class TestDefaultController {

    private DefaultController controller;

    @Before
    public void instantiate() throws Exception {
        controller = new DefaultController();
    }

    @Test
    public void testMethod() {
        throw new RuntimeException("implement me");
    }
}
