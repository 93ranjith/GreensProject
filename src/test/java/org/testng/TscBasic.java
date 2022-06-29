package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TscBasic {
	
     @BeforeClass
	public static void befClass() {
		System.out.println("before class");

	}
	
	@BeforeMethod
	public void brfMethod() {
		System.out.println("bfore methods");
	}
	@Test(groups="smock")
    public void testCase() {
		System.out.println("hellow world");
	}
	@Test(groups="smock")
	public void testCase1() {
		
		System.out.println("hi everone");
	}
	@Test(groups="sanity")
	public void testCase2() {
		System.out.println("\n good morning");
	}
	@Test(groups="smock")
	public void testCase3() {
		System.out.println("goodbay");

	}
	@AfterClass
	public void aftMehod() {
		System.out.println("aftre methods");
		
	}@AfterMethod
	public static void aftClass() {
		System.out.println("===after class===");

	}
	

}
