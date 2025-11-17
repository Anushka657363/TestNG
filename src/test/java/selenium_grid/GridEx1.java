package selenium_grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridEx1 {
	
	@Test
	public void m1()throws MalformedURLException, InterruptedException{
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/"),options);
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.id("basicelements")).click();
		driver.findElement(By.name("ufname")).sendKeys("Anushka");
		driver.findElement(By.name("ulname")).sendKeys("Katiyar");
		driver.findElement(By.name("cmpname")).sendKeys("ABC");
		
		
	}

}
