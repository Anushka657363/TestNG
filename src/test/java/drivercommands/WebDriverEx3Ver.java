package drivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverEx3Ver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String userName="Anushka";
		String email="anushka123@gmail.com";
		String currloc="Pune";
		String prloc="Kanpur";
		driver.get("https://demoqa.com/");
		WebElement elements=driver.findElement(By.xpath("//div[@class='card-body']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", elements);
	driver.findElement(By.id("item-0")).click();
	driver.findElement(By.id("userName")).sendKeys("Anuka");
	driver.findElement(By.id("userEmail")).sendKeys("anushka123@gmail.com");
	driver.findElement(By.id("currentAddress")).sendKeys("Talawade");
	driver.findElement(By.id("permanentAddress")).sendKeys("Kannauj");
	
	js.executeScript("arguments[0].click();", 
		driver.findElement(By.id("submit")));
	//verifying by id
	//WebElement name=driver.findElement(By.id("name"));
	//verifying by using xpath
	WebElement name=driver.findElement(By.xpath("//*[@id=\"name\"]"));
	//System.out.println(userName);
//	System.out.println(name.getText());
	if(userName.equals(name.getText().split(":")[1])) {
		System.out.println("Name matched");
	}
	else {
		System.out.println("Not matched");
	}
	
//	WebElement checkcon=driver.findElement(By.xpath(""));
		
		

	}

}
