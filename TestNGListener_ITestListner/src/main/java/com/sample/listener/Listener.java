package com.sample.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sample.testscripts.BaseTest;

public class Listener extends BaseTest implements ITestListener {

	public void onFinish(ITestContext Result) {
		
		
	}

	public void onStart(ITestContext Result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		
		
	}

	public void onTestFailure(ITestResult Result) {
		System.out.println("The name of the failed testcase is "+Result.getName());
	}

	public void onTestSkipped(ITestResult Result) {
		System.out.println("Skipped testcase is "+Result.getName());
		
	}

	public void onTestStart(ITestResult Result) {
		System.out.println("Testcase started "+Result.getName());
		
	}

	public void onTestSuccess(ITestResult Result) {
		System.out.println("Passes testcase: "+Result.getName());
		
	}

}
