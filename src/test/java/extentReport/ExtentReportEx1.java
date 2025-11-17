package extentReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 
public class ExtentReportEx1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver  = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/report.html");
		reporter.config().setReportName("Automation Test Repot");
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Ayush");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("Browser", "QA");
		ExtentTest test = report.createTest("LoginTest", "verify login functionality");
		WebElement regis = driver.findElement(By.id("registration2"));
		regis.click();
		test.log(Status.PASS, "Regis link clicked");
		driver.findElement(By.id("unameSignin")).sendKeys("Ayush");
		test.log(Status.PASS, "username entered");
		driver.quit();
		report.flush();

	}
 
}