package com.chtuqu.junit_in_action.ch2.suite;

import com.chtuqu.junit_in_action.ch2.parameterized.ParameterizedTestNoConstructor;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value = { ParameterizedTestNoConstructor.class })
public class SuiteB {
}
