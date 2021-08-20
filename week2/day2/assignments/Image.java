package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img"))
				.click();
		driver.navigate().back();

		String string = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img"))
				.getAttribute("src");
		driver.get(string);
		System.out.println("The broken image link is " + string);
		String imgTitle = driver.getTitle();
		if (imgTitle.equals("HTTP Status 404 – Not Found"))
			System.out.println("Image is broken " + driver.getTitle());
		else
			System.out.println("Image is not Broken");
		driver.navigate().back();

		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img"))
				.click();
	}

}
