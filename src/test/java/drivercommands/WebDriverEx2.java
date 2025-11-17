package drivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverEx2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com");
//	    WebElement textBox=	driver.findElement(By.id(""));
//	    textBox.sendKeys("Selenium");
		driver.get("http://automationbykrishna.com/#");
	//	WebElement registration=driver.findElement(By.id("registration2"));
	//	registration.click();
		Thread.sleep(2000);
//		WebElement user=driver.findElement(By.id("unameSignin"));
//		user.sendKeys("Anushka");
//		WebElement password=driver.findElement(By.id("pwdSignin"));
//		password.sendKeys("Anushka");
		//WebElement fullname=driver.findElement(By.name("fName"));
		//WebElement fullname=driver.findElement(By.className("form-control"));
	//	fullname.sendKeys("Anushka");
		//WebElement bylinktxt=driver.findElement(By.linkText("Regis"));
		WebElement bypartiallinktxt=driver.findElement(By.partialLinkText("Regis"));
		
		

	}

}
