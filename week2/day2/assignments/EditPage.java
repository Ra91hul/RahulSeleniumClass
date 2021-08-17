package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abc@gmail.com");
		//
		WebElement appnd = driver.findElement(By.xpath("//input[@value=\"Append \"]"));
		appnd.sendKeys("Text");
		appnd.sendKeys(Keys.TAB);

		String dfltTxt = driver.findElement(By.xpath("//input[contains(@value,'Leaf')]")).getAttribute("Value");
		System.out.println(dfltTxt);

		driver.findElement(By.xpath("//input[contains(@value,'Clear')]")).clear();

		WebElement disbld = driver
				.findElement(By.xpath("//label[contains(text(),'Confirm that edit')]/following-sibling::input"));
		if (disbld.isDisplayed())
			System.out.println("The field is disabled " + disbld.isDisplayed());
		else
			System.out.println("This field is not disabled " + disbld.isEnabled());
	}

}
