package week5.day1.assignments.servicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewIncident extends CommonClassServiceNow {

	@Test
	public void runNewIncident() throws InterruptedException {
		//Click on Create new option and fill the manadatory fields
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("Run Create New Incident");
		
		//Verify the newly created incident ( copy the incident number and paste it in search field and enter then verify the instance number created or not)
		String incident = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println(incident);
		driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();
		Thread.sleep(1000);
		
		WebElement searchIncident = driver.findElement(By.xpath("//input[@class='form-control']"));
		searchIncident.sendKeys(incident);
		searchIncident.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		String searchRslt = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();

		if (searchRslt.equals(incident))
			System.out.println("Incident Created successfully");
		else
			System.out.println("Incident Not Created");
	}

}