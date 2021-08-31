package week4.day1.assignments;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	/*
	 * Step1: Load ServiceNow application URL given above
	 * 
	 * Step2: Enter username as admin
	 * 
	 * Step3: Enter password as w6hnF2FRhwLC
	 * 
	 * Step4: Click Login
	 * 
	 * Step5: Search “incident “ Filter Navigator
	 * 
	 * Step6: Click “All”
	 * 
	 * Step7: Click New button
	 * 
	 * Step8: Select a value for Caller and Enter value for short_description
	 * 
	 * Step9: Read the incident number and save it a variable
	 * 
	 * Step10: Click on Submit button
	 * 
	 * Step 11: Search the same incident number in the next search screen as below
	 * 
	 * Step12: Verify the incident is created successful and take snapshot of the created incident.
	 * 
	 */

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev113545.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.findElement(By.id("user_name")).sendKeys("admin");
		// driver.findElement(By.id("user_password")).sendKeys("w6hnF2FRhwLC");
		// driver.findElement(By.xpath("//button[text()='Log in']"));

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("w6hnF2FRhwLC");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident");

		driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();

		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();

		driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']")).click();
		Thread.sleep(1000);

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(1));

		driver.findElement(By.xpath("//a[@class='glide_ref_item_link']")).click();
		driver.switchTo().window(windowHandlesList.get(0));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@id='incident.short_description']"))
				.sendKeys("To Test Service now Portal");

		String incident = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println(incident);

		driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();
		Thread.sleep(1000);

		WebElement searchInc = driver.findElement(By.xpath("//input[@class='form-control']"));
		searchInc.sendKeys(incident);
		Thread.sleep(1000);
		searchInc.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		String searchedIncident = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();

		if (searchedIncident.equals(incident))
			System.out.println("Incident Created successfully");
		else
			System.out.println("Incident Not Created");

		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snaps/IncidentCreated.png");
		FileUtils.copyFile(src1, dst);

	}

}
