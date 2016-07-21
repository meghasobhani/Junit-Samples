package com.codelab;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestHorner {	
	 @Test
	 public void testForPositiveValues() throws Exception{  //Test for passing normal values with desired output 
		 String[] arr = new String[]{"2","1","0","2","1"};
	         assertEquals(Horner.solve(arr), 3);
	     }
	 
	 @Test(expected = ArrayIndexOutOfBoundsException.class)  //Test for array size less than needed
	 public void testForLessArguments() throws Exception{
		 String[] a2  = new String[]{"2","-1","-1","-1"};
		 Horner.solve(a2);		 
	 }
	 @Test(expected = NegativeArraySizeException.class)   //Test for giving negative value of degree of x
	 public void testForNegativeDegreeValue() throws Exception{
		 String[] a2  = new String[]{"-3","-1","-1","-1"}; 
		 Horner.solve(a2);
		 
	 }
	 @Test
	 public void testForNegativeValueOfX() throws Exception{ //Test for passing negative value of X
		 String[] arr = new String[]{"3","-1","1","2","3","1"};
		 assertEquals(Horner.solve(arr),-1);		 
	 }
	 @Test(expected = IllegalArgumentException.class)  //Test for passing additional arguments 
	 public void testForMoreNumberOfArguments() throws Exception{
		 String[] arr = new String[]{"2","1","1","2","1","1"};
		 Horner.solve(arr);
	 }

}
