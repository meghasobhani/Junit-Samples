package com.codelab;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import junit.runner.Version;
public class TestRunner {
	 public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(SuiteJunit.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	      

	      System.out.println("JUnit version is: " + Version.id());
	   }
}
