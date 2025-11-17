package drivercommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='card-body']"));
		for(WebElement ele:allLinks) {
			System.out.println(ele.getText());
		}
		driver.close();

	}

}
