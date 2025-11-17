package drivercommands;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que2 {

	public static void main(String[] args) {
		String name="Anushka";
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.id("basicelements")).click();
		WebElement elements=driver.findElement(By.xpath("//*[@id=\"javascriptPromp\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,600);", elements);
		driver.findElement(By.id("javascriptPromp")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Anushka");
		alert.accept();

		

	}

}
