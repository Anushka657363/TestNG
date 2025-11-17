package drivercommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverEx7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		WebElement registrationLink =driver.findElement(By.id("registration2"));
		registrationLink.click();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement userName=driver.findElement(By.id("unameSignin"));
		if(userName.isDisplayed() &&userName.isEnabled()) {
			userName.sendKeys("anushka");
			//Thread.sleep(2000);
			userName.clear();
			
			driver.close();
		}

	}

}
