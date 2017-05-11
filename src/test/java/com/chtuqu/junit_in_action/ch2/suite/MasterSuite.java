package com.chtuqu.junit_in_action.ch2.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value = { SuiteA.class, SuiteB.class})
public class MasterSuite {
}
