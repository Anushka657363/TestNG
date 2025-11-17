package extentReport;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportEx2 {

	public static void main(String[] args) {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/report.html");
		reporter.config().setReportName("Automation Test Repot");
		reporter.config().setDocumentTitle("Test Execution Report");
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Anushka");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("Browser", "Chrome");
		
		ExtentTest test = report.createTest("LoginTest", "verify login functionality");
		test.log(Status.PASS, "Regis link clicked");
		test.log(Status.PASS, "Username entered");
		
		ExtentTest test1=report.createTest("RegistrationTest","Verify Registration Functionality");
		test1.log(Status.FAIL, "Failed step");
		
		ExtentTest test2=report.createTest("PaymentTest","Verify payment Functionality");
		
		ExtentTest loginTest=test2.createNode("Login");
		loginTest.log(Status.PASS, "Enter Username");
		loginTest.log(Status.PASS, "Enter Password");
		loginTest.log(Status.PASS, "Click Submit");
	
	
		ExtentTest cartTest=test2.createNode("Select Product and navigate to Cart");
		cartTest.log(Status.PASS, "Select Product");
		cartTest.log(Status.PASS, "Click on add to cart button");
		
		ExtentTest paymentTest=test2.createNode("Make Payment");
		paymentTest.log(Status.PASS, "Verify produt in cart");
		cartTest.log(Status.PASS, "Enter credit card info and make payment");
						
		report.flush();
	
		
		
		
		
		
		
		

	}

}
