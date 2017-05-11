package com.chtuqu.junit_in_action.ch3.before;

import org.junit.*;

public class Second extends First {

    /* NOTE:
       This example does not cover method overrides.
       If the annotated method is overridden, the child version will be invoked instead of the parent one.
       On the other hand, if you have several methods with the same annotation in the class, the order is not defined.
     */

    @BeforeClass
    public static void beforeClassSecond() { // @BeforeClass-annotated methods must be public static void
        System.out.println("@BeforeClass in Second");
    }

    @Before
    public void beforeSecond() { // @Before-annotated methods must be public void
        System.out.println("@Before in Second");
    }

    @Test
    public void testMethod() {
        System.out.println("In Test");
    }

    @After
    public void afterSecond() { // @After-annotated methods must be public void
        System.out.println("@After in Second");
    }

    @AfterClass
    public static void afterClassSecond() { // @AfterClass-annotated methods must be public static void
        System.out.println("@AfterClass in Second");
    }

}
