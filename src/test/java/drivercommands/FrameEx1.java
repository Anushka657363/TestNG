package drivercommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.id("iframes")).click();
	//	driver.switchTo().frame("site1");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='site1']")));
		driver.findElement(By.id("iframes")).click();
		driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		
		driver.switchTo().defaultContent();
		//having frame inside a frame and want to come on main frame then parent 
		driver.switchTo().parentFrame();
		driver.findElement(By.id("iframes")).click();
		
	}

}
