package com.execution.scripts;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
public class testng {

	
	@BeforeTest
	public void beforetest() {
		System.out.println("before test");

	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");

	}
	
	@Test(priority=1)
	public void test1(){
		System.out.println("test");
	}

	@Test(priority=2)
	public void test2(){
		System.out.println("test");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");

	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");

	}


	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before Suite");

	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");

	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");

	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");

	}

}
