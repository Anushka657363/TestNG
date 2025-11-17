package drivercommands;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimentinoEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http:/automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Dimension dim=driver.manage().window().getSize();
//		System.out.println("Height: "+dim.getHeight());
//		System.out.println("Width: "+dim.getWidth());
		
		//setting the size
		driver.manage().window().setSize(new Dimension(1024,768));
		System.out.println("Height: "+dim.getHeight());
		System.out.println("Width: "+dim.getWidth());
		
		//driver.quit();

	}

}
