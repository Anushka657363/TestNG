package drivercommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEx1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:/timesofindia.indiatimes.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[text()='City'])[1]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[4]/div/div/div/div[1]/nav/ul/li[3]/div/div[2]/ul/li[4]/a"))).build().perform();
		
		
	}

}
