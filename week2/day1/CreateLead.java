package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

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

		String title = "My Home | opentaps CRM";
		String title2 = driver.getTitle();

		if (title.equals(title2))
			System.out.println("On the page");
		else
			System.out.println("Not on the page");

		// Step10: Click Leads tab
		driver.findElement(By.linkText("Leads")).click();

		// Step11: Click CreateLead
		driver.findElement(By.linkText("Create Lead")).click();

		// Step12: Enter Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company");

		// Step13: Enter FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Name");

		// Step14: Enter LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("last name");

		// Step15: Clear country code and send new one
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("5");

		// Locate dropdown and select by index
		WebElement srcDrop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1 = new Select(srcDrop1);
		drop1.selectByIndex(1);

		// Locate dropdown and select by Value
		WebElement marDrop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2 = new Select(marDrop2);
		drop2.selectByValue("9002");

		// Locate dropdown and select by text
		WebElement indDrop3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drop3 = new Select(indDrop3);
		drop3.selectByVisibleText("Aerospace");
		
		//Submit Lead
		driver.findElement(By.name("submitButton")).click();
		

	}

}
