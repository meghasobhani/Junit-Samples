package com.codelab;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestEratosthenes {
	private static Eratosthenes Eratosthenes = null;
	HashMap<Integer, int[]> hm = new HashMap<Integer, int[]>();
	
	
	 @BeforeClass
	 public static void setupBeforeTests() throws Exception {
		 Eratosthenes = new Eratosthenes();
	 }
	 
	 // Test Exception is handled for negative numbers
	 /*
	  Ideally we should throw an user defined exception for negative numbers. 
	  As the code does not have an user defined exception we have for now caught an illegal argument exception
	  */
	 @Test(expected = Exception.class)   //Test for passing negative number as argument
	 public void testExceptionForNegativeNumber() throws Exception{
		 Eratosthenes.primes(-1);
	 }
	 
	 @Test(expected = Exception.class)  //Test for passing zero 
	 public void testExceptionForZero() throws Exception{
		 Eratosthenes.primes(0);
	 }
	 
	 @Test
	 public void testValues() throws Exception{    //Test for some general values with desired output
		 hm.put(2, new int[]{2});
		 hm.put(3, new int[]{2,3});
		 hm.put(5, new int[]{2,3,0,5});
		 hm.put(15, new int[]{2,3,0,5,0,7,0,0,0,11,0,13,0,0});
		 
		 Set<Entry<Integer, int[]>> entrySet = hm.entrySet();
	     
		 Iterator<Entry<Integer, int[]>> itr = entrySet.iterator();
	      // Display elements
	      while(itr.hasNext()) {
	         Entry<Integer, int[]> entry = itr.next();
	         int[] key = Eratosthenes.primes((Integer) entry.getKey());
	         int[] value = (int[])entry.getValue();
	         assertArrayEquals(key, value);
	     }
	 }
	 
	 
}
