package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("UserFirstName")).sendKeys("Rahul");
		driver.findElement(By.name("UserLastName")).sendKeys("Singh");
		driver.findElement(By.name("UserEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Cognizant");
		driver.findElement(By.name("UserPhone")).sendKeys("9265842504");

		WebElement usrTitle = driver.findElement(By.name("UserTitle"));
		Select userTitleDrpDwn = new Select(usrTitle);
		userTitleDrpDwn.selectByIndex(5);

		WebElement empDrp = driver.findElement(By.name("CompanyEmployees"));
		Select empdrpdwn1 = new Select(empDrp);
		empdrpdwn1.selectByVisibleText("15 - 100 employees");

		WebElement cmpdrp = driver.findElement(By.name("CompanyCountry"));
		Select cmpdrpdwn1 = new Select(cmpdrp);
		cmpdrpdwn1.selectByValue("AE");

		driver.findElement(By.className("checkbox-ui")).click();
		driver.close();

	}

}
