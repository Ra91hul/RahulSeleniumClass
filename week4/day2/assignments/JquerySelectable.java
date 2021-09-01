package week4.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquerySelectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().frame(0);

		WebElement source = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement target = driver.findElement(By.xpath("//li[text()='Item 5']"));

		Actions builder = new Actions(driver);
		builder.clickAndHold(source).moveToElement(target).release().perform();
	}

}
