package com.tcsblog;

import org.green.BaseClasses;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TscBasic extends BaseClasses{
	
	@BeforeClass
	public static void befClass() {
		System.out.println("before class");

	}
	
	@Before
	public void brfMethod() {
		System.out.println("bfore methods");
	}
	@Test
    public void testCase() {
		System.out.println("hellow world");
	}
	@Test
	public void testCase1() {
		
		System.out.println("hi everone");
	}
	@Test
	public void testCase2() {
		System.out.println("\n good morning");
	}
	@Test
	public void testCase3() {
		System.out.println("goodbay");

	}
	@After
	public void aftMehod() {
		System.out.println("aftre methods");
		
	}@AfterClass
	public static void aftClass() {
		System.out.println("===after class===");

	}
	

}
