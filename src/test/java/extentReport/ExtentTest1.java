package extentReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentTest1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/report.html");
		reporter.config().setReportName("Automation Test Repot");
		reporter.config().setDocumentTitle("Test Execution Report");
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Anushka");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("Browser", "Chrome");
		
		ExtentTest test=report.createTest("LoginTest","Verify Login Functionality");
		
		WebElement registration=driver.findElement(By.id("registration2"));
		registration.click();
		test.pass("Registration clicked",MediaEntityBuilder
				.createScreenCaptureFromPath("file:///C:/Users/anushkat/eclipse-workspace/SeleniumTraining/Screenshots/sc.png")
		.build());
		
		driver.findElement(By.id("unameSignin")).sendKeys("Anushka");
		test.log(Status.PASS, "UserName entered");
		
		test.pass("Registration clicked",MediaEntityBuilder.
				createScreenCaptureFromPath("file:///C:/Users/anushkat/eclipse-workspace/SeleniumTraining/Screenshots/sc.png")
				.build());
		test.pass("Registration Clicked").addScreenCaptureFromPath("file:///C:/Users/anushkat/eclipse-workspace/SeleniumTraining/Screenshots/sc.png");
		driver.quit();
		report.flush();
		

	}

}
