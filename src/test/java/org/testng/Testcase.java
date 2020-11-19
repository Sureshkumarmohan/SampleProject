package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase {

	
	@BeforeClass
	private void beforeClass() {
	System.out.println("BeforeClass");
	}
	@AfterClass
	private void afterClass() {
	System.out.println("AfterClass");	
	}
	@BeforeMethod
	private void beforeMethod() {
	System.out.println("BeforeMethod");
	}
	@AfterMethod
	private void afterMethod() {
	System.out.println("AfterMethod");	
	}
	@Test
	private void mainTest() {
	System.out.println("Test");
	}	
	
}


