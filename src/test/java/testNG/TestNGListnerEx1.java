package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListnerEx1 implements ITestListener {
	
	public void onTestSuccess11(ITestResult result) {
		System.out.println("Listener:Test Passed");
	}
	
    public void onTestFailure(ITestResult result) {
    	System.out.println("Listener:Test Failed");
	}

    public void onTestSkipped(ITestResult result) {
    	System.out.println("Listener:Test skipped");
  }
    public void onStart(ITestResult result) {
		System.out.println("Listener:Test Started");
	}
    public void onTestFinished(ITestResult result) {
		System.out.println("Listener:Test Finished");
	}
	
	
	
	
	

}
