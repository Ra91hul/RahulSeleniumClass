package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowserLocateElements {

	public static void main(String[] args) {
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();

		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Step 4: Maximise the window
		driver.manage().window().maximize();

		// wait for 10 seconds if the element is not in the DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step 5: Locate the username and type "demosalesmanager"
		WebElement webUser = driver.findElement(By.id("username"));
		webUser.sendKeys("demosalesmanager");

		// Step 6: Locate the password and type "crmsfa"
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Step 7: Locate the Login button and click it
		driver.findElement(By.className("decorativeSubmit")).click();

		// Step 8: Locate and Click CRM/SFA link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

	}

}
