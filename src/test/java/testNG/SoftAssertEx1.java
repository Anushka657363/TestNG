//package testNG;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class SoftAssertEx1 {
//	@Test
//	public void login() {
//	WebDriver driver=new ChromeDriver();
//	driver.get("http://automationbykrishna.com/");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	driver.manage().window().maximize();
//	WebElement element= driver.findElement(By.id("basicelement"));
//	SoftAssert soft=new SoftAssert();
//	soft.assertTrue(element.isDisplayed();
//	//soft.assertEquals(driver.getTitle(),"Login");
//	softAssert(True);
//	softAssertAll();
//	driver.quit();
//	
//
//}
