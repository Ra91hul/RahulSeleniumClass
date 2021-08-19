package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("yes")).click();

		// Find default selected radio element
		WebElement dfltRadio = driver.findElement(By.xpath("//input[@name='news']/following::input"));
		System.out.println(dfltRadio.getText());
		
		if (dfltRadio.isSelected()) {
			System.out.println("Default Selected");
		}


		WebElement ageDrpdwn = driver
				.findElement(By.xpath("//label[contains(text(),'Select your age')]//following::input[3]"));
		if (!ageDrpdwn.isSelected())
			ageDrpdwn.click();
	}

}
