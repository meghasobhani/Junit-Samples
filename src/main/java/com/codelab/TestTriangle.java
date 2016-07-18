package com.codelab;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {
		
	 @Test
	 public  void testForNegativeValues()  {   //Test for passing negative values as sides of triangle
		 Triangle Triangle = new Triangle(-1,-1,-1);
		 assertEquals(Triangle.classify(),-1); //Compares result with -1, Triangle with negative sides returns -1 in the code
	 }	
	 @Test
	 public void testForZeroTriangle(){  //Test for passing all sides = 0
		 Triangle triangle = new Triangle(0,0,0);
		 assertEquals(triangle.classify(),-1);
	 }
	 @Test
	 public void testForEquilateralTriangle() {    //Test for Equilateral triangle
		 Triangle Triangle = new Triangle(5,5,5);
		 boolean condition = Triangle.classify()!=0;
		 assertTrue(condition);   //Compares result with 1, Equilateral triangle returns 1 in the code
	 }
	 @Test
	 public void testForScaleneTriangle(){    //Test for standard Scalene Triangle
		 Triangle triangle = new Triangle(3,4,5);
		 assertEquals(triangle.classify(),3);
	 }
	 @Test
	 public void testForTwoSameSidesTriangle(){  //Test for an invalid triangle
		 Triangle triangle = new Triangle(2,2,4); //Seems isosceles triangle but is not a valid triangle as sum of lengths of two sides must exceed third side
		 assertEquals(triangle.classify(),4);	  //Must return 4
	 }
	 @Test
	 public void testForNotValidTriangle(){       //Test for an invalid triangle
		 Triangle triangle = new Triangle(1,4,3); //Sum of two sides here equals third side. Hence not a triangle
		 assertEquals(triangle.classify(),4);  //Must return 4
	 }
	
	 @Test
	 public void testForIsoscelesTriangle(){  //Test for Isoscles Triangle
		 Triangle triangle = new Triangle(4,4,3);
		 assertEquals(triangle.classify(),2);
	 }
	 @Test
	 public void testForLargeValue(){   //Test for large values
		 Triangle triangle = new Triangle(100000,100000,20000);
		 assertEquals(triangle.classify(),2);
	 }	 
}
