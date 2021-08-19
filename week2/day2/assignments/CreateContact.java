package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
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

		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		
		//Enter First Name and Last name using ID locator
		driver.findElement(By.id("firstNameField")).sendKeys("Rahul");
		driver.findElement(By.id("lastNameField")).sendKeys("Singh");
		
		//Enter FirstName(Local) and LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Satish");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Vishwambhar");
		
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Home");
		
		//Enter Description Field Using any Locator of Your Choice
		driver.findElement(By.id("createContactForm_description")).sendKeys("To Create Contact Lead");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text
		WebElement stateDrpdwn = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateDropdown1 = new Select(stateDrpdwn);
		stateDropdown1.selectByVisibleText("Louisiana");
		
		//Click on Create Contact
		driver.findElement(By.className("smallSubmit")).click();
		
		//Click on edit button 
		driver.findElement(By.linkText("Edit")).click();
		
		//Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		//Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Class to Learn Create Contact");
		
		//Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		//Get the Title of Resulting Page.
		System.out.println("Title of the resulting page " + driver.getTitle());
		
		
	}

}
