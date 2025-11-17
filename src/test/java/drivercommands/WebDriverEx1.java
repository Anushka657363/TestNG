package drivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverEx1 {
	public static void main(String[]args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
	//	driver.findElement(By.id(null));
		//driver.location();
	//	ChromeDriver driver1 = new ChromeDriver();
	//	driver1.location();
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--headless");
		option.addArguments("--incognito");
	//	option.addArguments("--start-maximized");
		option.addArguments("--disable-popup-blocking");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		//if want to check open correct title we can write it in if else block
//		if("Google".equalsIgnoreCase(driver.getTitle())) {
//			
//		}else {
//			
//		}
//		System.out.println("Title"+driver.getTitle());
//		System.out.println("CurrentURL"+driver.getCurrentUrl());
	//	System.out.println("PageSource"+driver.getPageSource());
//		driver.close();
//		
//		driver.get("http://demoqa.com/browser-windows");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", driver.findElement(By.id("tabButton")));
//		Thread.sleep(2000);
//		driver.quit();
	
		System.out.println("Current Title:"+driver.getTitle());
		driver.get("http://demoqa.com/");
		Thread.sleep(2000);
		driver.navigate().back();	
		System.out.println("After clicking on back button: Title"+driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("After clicking on forward button: Title"+driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.quit();
	}

}
