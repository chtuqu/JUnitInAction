package com.chtuqu.junit_in_action.ch3.before;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class First {

    @BeforeClass
    public static void beforeClassFirst() {
        System.out.println("@BeforeClass in First");
    }

    @Before
    public void beforeFirst() {
        System.out.println("@Before in First");
    }

    @After
    public void afterFirst() {
        System.out.println("@After in First");
    }

    @AfterClass
    public static void afterClassFirst() {
        System.out.println("@AfterClass in First");
    }

}
