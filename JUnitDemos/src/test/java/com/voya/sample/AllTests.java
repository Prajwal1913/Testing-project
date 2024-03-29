package com.voya.sample;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import com.voya.testcases.CalculatorTest;
import com.voya.training.Calculator;

@RunWith(JUnitPlatform.class) // using junit 4
@SelectPackages({"com.voya.testcases"})
//@IncludePackages({"com.voya.testcases.trial"})
//@ExcludePackages({"com.voya.testcases.greet"})
//@SelectClasses({CalculatorTest.class})
@IncludeTags({"first","second","simple","negative"})
public class AllTests {

}
