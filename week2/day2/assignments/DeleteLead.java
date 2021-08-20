package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click Leads link
		driver.findElement(By.linkText("Leads")).click();

		// Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);

		// Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		// Enter phone number
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("678594830");

		// Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);

		// Capture lead ID of First Resulting lead
		WebElement firstResultingLead = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));

		String frstRsltLeadText = firstResultingLead.getText();
		System.out.println(" First Resulting Lead Text :" + frstRsltLeadText);

		// Click First Resulting lead
		Thread.sleep(1000);
		firstResultingLead.click();

		// Click Delete
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Delete']")).click();

		// Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();

		// Enter captured lead ID
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(frstRsltLeadText);

		// Click Find Lead
		driver.findElement(By.xpath("//button[text()='Find Leads']"));

		// Verify message "No records to display" in the Lead List. This message
		// confirms the successful deletion
		String finalResult = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println("Final Message is : " + finalResult);

		if (finalResult.contains(finalResult))
			System.out.println("No records are there to display for the Lead id");
		else
			System.out.println("Still records are there to display for the Lead id");
		Thread.sleep(5000);
		driver.close();
	}

}
