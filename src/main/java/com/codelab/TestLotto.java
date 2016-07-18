package com.codelab;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLotto {
	long[] arr = new long[]{1,2,3,4,5,6};
	@Test(expected = Exception.class)
	public void TestForNegativeInput() throws Exception { //Test for Negative arguments to constructor
		Lotto lotto = new Lotto(-1000000,100000,89,arr);
		lotto.getDate();
	}
	@Test
	public void TestForNegativeNumber() {   //Test for giving negative number to function getNumber()
		Lotto lotto = new Lotto(-1000000,100000,89,arr);
		assertEquals(lotto.getNumber(-1),0);
	}
	@Test(expected = Exception.class)
	public void TestForNegativeArray()   //Test for passing negative array
	{
		long[] array = new long[]{-5,-5,-5,-6,-7,9};    //Array should consist of positive values
		Lotto lotto = new Lotto(12,54,89,array);
		assertEquals(lotto.getNumber(1),-5);
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)  //Test for passing array size< 6
	public void TestForSmallSizedArray(){
		long[] array = new long[]{7,8,9};
		Lotto lotto = new Lotto(12,8,79,array);
		lotto.getNumber(6);
	}
	@Test(expected = IllegalArgumentException.class)  //Test for passing incorrect value in the field year
	public void TestForIncorrectYear(){    
		long[] array = new long[]{7,8,9,8};
		Lotto lotto = new Lotto(12,8,99999999,array);
		lotto.getDate();
	} 
	@Test(expected = IllegalArgumentException.class)   //Test for passing incorrect value in the field month
	public void TestForIncorrectMonth(){
		Lotto lotto = new Lotto(777777777,9999999,77,arr);
		lotto.getDate();		
	}
}
