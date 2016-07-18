package com.codelab;


	import org.junit.runner.RunWith;
	import org.junit.runners.Suite;

	@RunWith(Suite.class)
	@Suite.SuiteClasses({
	  TestEratosthenes.class,
	  TestEuclid.class,
	  TestFibonacci.class,
	  TestHorner.class,
	  TestLotto.class,
	  TestTriangle.class
  
	})
	public class SuiteJunit {
	
}
