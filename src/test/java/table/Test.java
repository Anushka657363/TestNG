package table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement editBtn=driver.findElement(By.xpath("//*[text()='Compliance']/following-sibling::div/div/span[@class='mr-2']"));
		js.executeScript("arguments[0].scrollIntoView()",editBtn);
		js.executeScript("arguments[0].click()",editBtn);
		
		WebElement slrUpdate=driver.findElement(By.xpath("//input[@id='salary']"));
		slrUpdate.click();
		slrUpdate.clear();
		slrUpdate.sendKeys("25000");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Anushka");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Katiyar");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("anu12@gmail.com");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("21");
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("26000");
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("Testing");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement submit2=wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.id("submit"))));
		submit2.click();
		
		

	}

}
