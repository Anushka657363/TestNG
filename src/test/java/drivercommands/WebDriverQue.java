package drivercommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverQue {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
	//	List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='container-fluid']"));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement ele:allLinks) {
			System.out.println(ele.getAttribute("href")+"--"+ele.getAttribute("innerText"));
		}
	}

}
