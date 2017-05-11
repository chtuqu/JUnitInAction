package com.chtuqu.junit_in_action.ch2.suite;

import com.chtuqu.junit_in_action.ch2.parameterized.DefaultParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = { DefaultParameterizedTest.class })
public class SuiteA {
}
