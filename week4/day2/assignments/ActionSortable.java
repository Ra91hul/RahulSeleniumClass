package week4.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSortable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		
		System.out.println(item1.getText());
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		System.out.println(item5.getText());

		
		Point location = item5.getLocation();
		int x = location.getX();
		int y = location.getY();

		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, x, y).perform();
		
	
	}

}
