package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement btnTotravel = driver.findElement(By.xpath("//button[text()='Go to Home Page']"));
		btnTotravel.click();

		driver.navigate().back();

		Point position = driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation();
		System.out.println("Location of the web element " + position);

		String btncolor = driver.findElement(By.xpath("//button[text()='What color am I?']"))
				.getCssValue("background-color");
		System.out.println("Button color is " + btncolor);

		System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize());
	}

}
