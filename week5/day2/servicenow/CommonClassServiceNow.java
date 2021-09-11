package week5.day1.assignments.servicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonClassServiceNow {

	public ChromeDriver driver;

	@Parameters({"username","password","url"})
	@BeforeMethod
	public void preCondition(String uName,String pWord, String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("user_name")).sendKeys(uName);
		Thread.sleep(1000);
		driver.findElement(By.id("user_password")).sendKeys(pWord);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(1000);
		WebElement inputIncident = driver.findElement(By.xpath("//input[@id='filter']"));
		inputIncident.sendKeys("incident");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Incidents']")).click();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void postCondition() {
		driver.close();

	}

}
