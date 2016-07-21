package com.codelab;

import org.junit.Test;

import junit.framework.Assert;

import org.junit.BeforeClass;
import static org.junit.Assert.*;
import java.util.*;
import java.util.Map.Entry;
public class TestFibonacci {
	private static Fibonacci fibonacci = null;
	HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
	
	
	 @BeforeClass
	 public static void setupBeforeTests() throws Exception {
		 fibonacci = new Fibonacci();
	 }
	 
	 // Test Exception is handled for negative numbers
	 /*
	  Ideally we should throw an user defined exception for negative numbers. 
	  As the code does not have an user defined exception we have for now caught an illegal argument exception
	  */
	 @Test(expected = IllegalArgumentException.class)  //Test for passing negative number as argument to fib()
	 public void testExceptionForNegativeNumber(){
		 fibonacci.fib(-1);
		
	 }	 
	 @Test(timeout = 1000)
	 public void testFibonnaciValue(){	//Test for checking fibonacci value for different values
		 
		 hm.put(0,0);
		 hm.put(1,1);
		 hm.put(2,1);
		 hm.put(3,2);
		 hm.put(12,144);
		 Set<Entry<Integer,Integer>> entrySet = hm.entrySet();	     
		 Iterator<Entry<Integer, Integer>> itr = entrySet.iterator();
	      // Display elements
	      while(itr.hasNext()) {
	         Map.Entry entry = (Map.Entry)itr.next();
	         assertEquals(fibonacci.fib((Integer) entry.getKey()), entry.getValue());
	     }
	 }
	 @Test(timeout = 1000)     
	 public void testForLargeValues(){
		 fibonacci.fib(47);
		 assertTrue( fibonacci.fib(47)>0);//Argument passed is of type int. Factorial of 47 exceeds range of int and returns negative value.
	 }
	
}
