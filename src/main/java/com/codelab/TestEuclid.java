package com.codelab;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestEuclid {
	private static Euclid Euclid = null;
	HashMap<int[], Integer> hm = new HashMap<int[], Integer>();	
	 @BeforeClass
	 public static void setupBeforeTests() throws Exception {
		 Euclid = new Euclid();
	 }	 
	 
	 @Test(expected = Exception.class)    //Test for passing zero as arguments, must result in exception
	 public void testExceptionForZero() throws  Exception{ 
			 Euclid.gcd(0,0);		
	 }
	 
	 @Test 
	 public void testNegativeValues() throws Exception   //Test for negative arguments with desired result
	 {	
		 assertEquals(Euclid.gcd(-1, -1),1);		
	 }	
	 @Test   									//Test for some general values with desired results
	 public void testPositiveValues() throws Exception {
		 hm.put(new int[]{2,2},2);
		 hm.put(new int[]{7,25},1);
		 hm.put(new int[]{10000,770000},10000);
		 Set<Entry<int[],Integer>> entrySet = hm.entrySet();	     
		 Iterator<Entry<int[], Integer>> itr = entrySet.iterator();
	          
	    while(itr.hasNext()) {
	    	Entry<int[], Integer> entry = itr.next();
	    	int[] a =  (int[]) entry.getKey();
	    	int key =  Euclid.gcd(a[0],a[1]);
	    	int value = (Integer) entry.getValue();
	    	assertEquals(key, value);	     
	     }
	 }
	 @Test(expected = IllegalArgumentException.class)   //Test for passing characters as arguments
	 public void testIllegalArg() throws Exception
	 {
		 Euclid.gcd('A', 'B');
	 }
}

