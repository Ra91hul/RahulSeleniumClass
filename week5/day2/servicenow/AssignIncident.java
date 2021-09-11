package week5.day1.assignments.servicenow;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.assignments.leaftaps.ReadExcel;

public class AssignIncident extends CommonClassServiceNow {

	@Test(dataProvider = "sendData")
	public void runAssignIncident(String assignmentGrp,String updateNotes) throws InterruptedException {

		// click on open and Search for the existing incident and click on the incident
		driver.findElement(By.xpath("//div[text()='Open']")).click();
		Thread.sleep(1000);
		WebElement frame6 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame6);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();

		// Assign the incident to Software group
		WebElement assignmentGroup = driver.findElement(By.id("sys_display.incident.assignment_group"));
		assignmentGroup.clear();
		assignmentGroup.sendKeys(assignmentGrp);
		assignmentGroup.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		// Update the incident with Work Notes
		driver.findElement(By.id("activity-stream-textarea")).sendKeys(updateNotes);
		Thread.sleep(1000);
		driver.findElement(By.id("sysverb_update_bottom")).click();

		// Verify the Assignment group, Assigned for the incident
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		Thread.sleep(1000);
		WebElement assignmentGroup1 = driver.findElement(By.id("sys_display.incident.assignment_group"));
		System.out.println(assignmentGroup1.getAttribute("value"));

	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
		return ReadExcel1.readData1("Assign");

}
}

