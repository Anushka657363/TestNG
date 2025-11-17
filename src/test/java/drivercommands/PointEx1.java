package drivercommands;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Point point =driver.manage().window().getPosition();
		System.out.println("X: "+point.getX());
		System.out.println("Y: "+point.getY());
		driver.manage().window().setPosition(new Point(100,100));
	}

}
