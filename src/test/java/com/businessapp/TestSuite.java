package com.businessapp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.businessapp.customer.CustomerTests;


/**
 * Unit test for simple App.
 * Comparison JUnit3 (extends TestCase) vs. JUnit4 (@Test) can be found in
 *		https://stackoverflow.com/questions/2635839/junit-confusion-use-extends-testcase-or-test
 */

@RunWith( Suite.class )
@SuiteClasses({
	AppTest.class, 
	CustomerTests.class
	})

public class TestSuite {

}
