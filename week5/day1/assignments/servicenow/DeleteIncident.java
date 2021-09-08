package week5.day1.assignments.servicenow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteIncident extends CommonClassServiceNow {

	@Test
	private void runDeleteIncident() throws InterruptedException {

		// Search for the existing incident and navigate into the incident
		WebElement frame4 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("(//a[@class='linked formlink'])[9]")).click();
		Thread.sleep(1000);

		String incident = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println(incident);

		// Delete the incident
		driver.findElement(By.xpath("//button[@id='sysverb_delete_bottom']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ok_button")).click();
		Thread.sleep(1000);

		WebElement searchIncident = driver.findElement(By.xpath("//input[@class='form-control']"));
		searchIncident.sendKeys(incident);
		Thread.sleep(1000);
		searchIncident.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		String searchRslt = driver.findElement(By.xpath("//td[text()='No records to display']")).getText();

		if (!searchRslt.equals(incident))
			System.out.println("Incident Deleted successfully");
		else
			System.out.println("Incident not Deleted");
	}

}
