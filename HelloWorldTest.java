/*
 * @(#)HelloWorldTest.java	05/22/2014 
 *
 */
 package com.test;

import junit.framework.TestCase;
import junit.swingui.TestRunner;
import junit.framework.AssertionFailedError;

 /**
 * HelloWorldTest class is a sample class to create Junit 
 * Test Cases of HelloWorld.java
 * 
 * @author  Shiv
 * @version 1.0
 */
public class HelloWorldTest extends TestCase{

	/**
	* Constructor required for intializing TestCase.
	*/
	public HelloWorldTest(String name){
			super(name);
	}

	/**
	* main method required for execution of class.
	*/
	public static void main(String args[]){
		junit.swingui.TestRunner.run(HelloWorldTest.class);
	}

	/**
	* testSayHelloWorld method required for testing sayHello of HelloWorld class.
	*/
	public void testSayHelloWorld(){
		HelloWorld world =  new HelloWorld();
		assertEquals("HelloWorld",world.sayHello());

	}

	/**
	* testSquare method required for testing getSquare of HelloWorld class.
	*/
	public void testSquare(){
		HelloWorld world =  new HelloWorld();
		assertEquals(18,world.getSquare(3));
		assertEquals(9,world.getSquare(3));
		assertEquals(12,world.getSquare(4));
	}

	/**
	* testDivide method required for testing getDivide of HelloWorld class.
	*/
	public void testDivide(){
		HelloWorld world =  new HelloWorld();
		assertEquals(1,world.getDivide(3,3));
		assertEquals(0,world.getDivide(4,0));
		assertEquals(0,world.getDivide(0,2));
	}

}