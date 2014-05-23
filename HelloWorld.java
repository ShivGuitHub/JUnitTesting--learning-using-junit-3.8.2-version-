/*
 * @(#)HelloWorld.java	05/22/2014 
 *
 */
package com.test;
/**
 * HelloWorld class is a sample class to give
 * a reference idea for creating Junit Test Cases.
 * 
 * @author  Shiv
 * @version 1.0
 */
class HelloWorld{

	/**
	* This method is welocme method. And it only returns "HellowWorld".
	*/
	public String sayHello(){
		return "HelloWorld";
	}
	
	/**
	* This method is use to get square of any number with in integer range.
	* @param   num   It is the digit used to be squared in method.
    * @return  square of the number.
	*/
	public int getSquare(int num){
		return num * num;
	}
	
	/**
	* This method is use to get divide of any number with in integer range.
	* @param   firstDigit  It is the digit used to be divided in method.
	* @param   secondDigit   It is the digit used to be divided in method.
    * @return  divide of the number.
	*/
	public int getDivide(int firstDigit, int secondDigit){
		return firstDigit / secondDigit;
	}
}