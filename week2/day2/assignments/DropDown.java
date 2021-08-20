package week2.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Select Training program using Index
		WebElement drpdwn1 = driver.findElement(By.id("dropdown1"));
		Select dropDown1 = new Select(drpdwn1);
		dropDown1.selectByIndex(2);

		// Select Training program using text
		WebElement drpdwn2 = driver.findElement(By.name("dropdown2"));
		Select dropDown2 = new Select(drpdwn2);
		dropDown2.selectByVisibleText("Selenium");

		// Select Training program by value
		WebElement drpdwn3 = driver.findElement(By.id("dropdown3"));
		Select dropDown3 = new Select(drpdwn3);
		dropDown3.selectByValue("3");

		// Select the number of dropdown options
		WebElement drpdwn4 = driver.findElement(By.className("dropdown"));
		Select dropDown4 = new Select(drpdwn4);
		System.out.println(dropDown4.getOptions().size());

		// You can also use send keys to select
		driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select")).sendKeys("Loadrunner");

		//Select your programs
		WebElement slctprograms = driver.findElement(By.xpath("//option[text()='Select your programs']/parent::select"));
		Select prgrm = new Select(slctprograms);
		List<WebElement> dd = prgrm.getOptions();
		
		for (int i = 1; i < dd.size()-1; i++) {
			dd.get(i).click();
			
		}

	}

}
