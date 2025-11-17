package table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableFindEle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement table=driver.findElement(By.id("countries"));
		List<WebElement>totalRows=driver.findElements(By.cssSelector("#countries tbody tr"));
		List<WebElement>totalCol=driver.findElements(By.cssSelector("#countries tbody tr td"));
		for(int i=0;i<totalRows.size();i++) {
			WebElement data = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+(i+1)+"]/td["+4+"]"));
			//  //*[@id='countries']/tbody/tr[td[4][text()='Euro']] for accessing euro via xpath
             if (data.getText().equals("Euro")) {
			System.out.println("Euro");
             WebElement checkbox = driver.findElement(By.xpath("//*[@id='countries']/tbody/tr[" + (i + 1) + "]/td[1]/input[@type='checkbox']"));
             checkbox.click();
             System.out.println("Checkbox selected for Euro currency row.");
    }
		}}

	}


