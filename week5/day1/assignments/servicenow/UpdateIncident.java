package week5.day1.assignments.servicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UpdateIncident extends CommonClassServiceNow {

	@Test
	public void runUpdateIncident() throws InterruptedException {

		// Search for the existing incident and click on the incident

		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame3);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='linked formlink'])[2]")).click();
		Thread.sleep(1000);

		// Update the incidents with Urgency as High and State as In Progress

		WebElement urgencyDropdown = driver.findElement(By.id("incident.urgency"));
		Select urgencydropDownSelect = new Select(urgencyDropdown);
		urgencydropDownSelect.selectByVisibleText("1 - High");
		Thread.sleep(1000);
		WebElement stateDropdown = driver.findElement(By.id("incident.state"));
		Select stateDropdownSelect = new Select(stateDropdown);
		stateDropdownSelect.selectByVisibleText("In Progress");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='sysverb_update_bottom']")).click();

		// Verify the priority and state
		driver.findElement(By.xpath("(//a[@class='linked formlink'])[2]")).click();
		Thread.sleep(1000);
		String state = driver.findElement(By.xpath("//span[text()='In Progress']")).getText();
		System.out.println("State :" + state);
		String priority = driver.findElement(By.xpath("//span[text()='3 - Moderate']")).getText();
		System.out.println("Priority :" + priority);

	}

}
