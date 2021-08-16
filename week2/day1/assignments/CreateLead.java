package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// 2. Enter UserName and Password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// 3. Click on Login Button
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// 5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		// 6. Click on create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();

		/*
		 * 7. Enter all the text fields in CreateLead page
		 ** 
		 * Note 1. Donot work on Parent Account Field 2.Enter the Birthdate using
		 * SendKeys
		 */
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Nirmala Bhojnalay");
		WebElement frstName = driver.findElement(By.id("createLeadForm_firstName"));
		frstName.sendKeys("Nirmala");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Singh");
		WebElement sourcedrpdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select srcdrpdwn1 = new Select(sourcedrpdown1);
		srcdrpdwn1.selectByIndex(4);
		WebElement markdrpdown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mrkdrpdwn2 = new Select(markdrpdown2);
		mrkdrpdwn2.selectByValue("CATRQ_ROADNTRACK");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Local");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("LastLocal");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs.");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/28/91");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("28/12/91");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Food Department");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("50,00,000");
		WebElement currdrpdown = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select currdrpdwn1 = new Select(currdrpdown);
		currdrpdwn1.selectByValue("INR");
		WebElement inddrpdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select inddrpdwn1 = new Select(inddrpdown);
		inddrpdwn1.selectByValue("IND_MANUFACTURING");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		WebElement owndrpdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select owndrpdwn1 = new Select(owndrpdown);
		owndrpdwn1.selectByVisibleText("Sole Proprietorship");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("55443");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ABS");
		driver.findElement(By.id("createLeadForm_description"))
				.sendKeys("This is a Sample program to test Selenium Webdriver class");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("approved");

		// 8. Enter all the text fields in contact information
		WebElement cntrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		cntrycode.clear();
		cntrycode.sendKeys("5");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("400101");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("079");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Sachin");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@testleaf.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("testleaf.com");

		// 9. Enter all the text fields in primary address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Rahul");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Rahul");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("A-101");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Test Building");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Citytest");
		WebElement statedrpdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select statedrpdwn1 = new Select(statedrpdown);
		statedrpdwn1.selectByVisibleText("New York");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("401");
		WebElement countrydrpdown = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countrydrpdown1 = new Select(countrydrpdown);
		countrydrpdown1.selectByVisibleText("United Kingdom");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("123");

		// 10. Get the Firstname and print it
		String frstName1 = frstName.getAttribute("value");
		System.out.println("First name is " + frstName1);

		// 11. Click on create Lead Button
		driver.findElement(By.name("submitButton")).click();

		// View Lead | opentaps CRM String title = "View Lead | opentaps CRM"; String
		String title = "View Lead | opentaps CRM";
		String verifyTitle = driver.getTitle();
		if (title.equals(verifyTitle))
			System.out.println("Title of the page is view Lead");
		else
			System.out.println("Title of the Page is not view Lead");

	}

}
