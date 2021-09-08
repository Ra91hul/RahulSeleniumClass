package week5.day2.assignments.Dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testcase.CommonClass;

public class CreateLead extends CommonClass {

	@Test(dataProvider = "sendData")
	public void runCreateLead(String firstName, String lastName, String company, String phNo) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();

	}
	
	@DataProvider
	private String[][] sendData() {
		//rows and columns
		
		String[][] data = new String[2][4];
		
		data[0][0] = "Rahul";
		data[0][1] = "Singh";
		data[0][2] = "CTS";
		data[0][3] = "12";
		
		data[1][0] = "Sachin";
		data[1][1] = "Shinde";
		data[1][2] = "Infosys";
		data[1][3] = "56";
		
		return data;
		
	}
}
