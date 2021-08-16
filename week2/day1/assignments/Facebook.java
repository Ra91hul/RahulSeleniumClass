package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rahul");
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		driver.findElement(By.name("reg_email__")).sendKeys("9265842504");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Poiuy@12345");

		WebElement dayDrpDwn = driver.findElement(By.id("day"));
		Select dayDrpDwn1 = new Select(dayDrpDwn);
		dayDrpDwn1.selectByIndex(27);
		WebElement monthDrpDwn = driver.findElement(By.id("month"));
		Select mnthDrpDwn1 = new Select(monthDrpDwn);
		mnthDrpDwn1.selectByValue("12");
		WebElement yrDrpDwn = driver.findElement(By.id("year"));
		Select yrDrpDwn1 = new Select(yrDrpDwn);
		yrDrpDwn1.selectByVisibleText("1991");

		driver.findElement(By.className("_8esa")).click();

	}

}
