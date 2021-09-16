package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {

	/*
	 * @Given("Open the chrome browser") public void openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 * 
	 * }
	 */

	/*
	 * @Given("Load the application url {string}") public void loadUrl(String url) {
	 * driver.get(url);
	 * 
	 * }
	 */

	@Given("Enter the username as {string}")
	public void enterUserName(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);

	}

	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("Click on Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Homepage should be displayed")
	public void verfiyHomePage() throws InterruptedException {
		driver.findElement(By.linkText("CRM/SFA")).click();		
	}

	/*
	 * @But("Error message should be displayed") public void verifyError() {
	 * System.out.println("Error message is displayed");
	 * 
	 * }
	 */

	/**
	 * Create Lead Step Definition
	 */

	@When("Click on Leads link")
	public void clickLeads() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		}

	@Then("My Leads Page should be displayed")
	public void verifyLeadsPage() {
		String title = driver.getTitle();
		System.out.println("Leads Page: " + title);

	}

	@When("Click on Create Lead link")
	public void clickLeadsOpt() {
		driver.findElement(By.linkText("Create Lead")).click();

	}

	@Then("Create Lead Page should be displayed")
	public void verifyCreateLeadHome() {
		System.out.println("Create Lead Page is displayed");

	}

	@When("Enter company name as {string}")
	public void enterCompany(String company) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
	}

	@When("Enter the first name as {string}")
	public void enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);

	}

	@When("Enter the last name as {string}")
	public void enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);

	}

	@When("Enter the phone number as {string}")
	public void enterPhonNum(String phNo) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);

	}

	@When("Click on Create lead button")
	public void clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();

	}

	/**
	 * Delete Lead Step Definition
	 * 
	 */

	@When("Click on Find Lead link")
	public void clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When("Find Leads Page should be displayed")
	public void findLeadsPage() {
		System.out.println("Leads Page is displayed");
	}
	
	@When("Click on Phone button")
	public void clickPhoneBtn() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}
	
	@When("Enter Phone number as {string}")
	public void enterPhonNum1(String phNo) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);

	}
	
	@When("Click on Find Leads button")
	public void clickFindLeadsbtn() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

	}
	
	@When("Click on first generated link")
	public void clickfirstrecord() {
		//String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}
	
	@Then("View Page should be displayed")
	public void verifyViewPage() {
		System.out.println("View Page is displayed");

	}
	
	@When("Click on Delete button")
	public void clickDeleteBtn() {
		driver.findElement(By.linkText("Delete")).click();

	}
	
	/**
	 * Edit Lead
	 */
	
	@When("Click on Edit button")
	public void clickEdit() {
		driver.findElement(By.linkText("Edit")).click();

	}
	
	@Then("Open Leads Page should be displayed")
	public void syso() {
		System.out.println("Open Leads Page displayed");

	}
	
	@When("Enter the company name as {string}")
	public void enterUpdateCompany(String company) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);

	}
	
	@When("Click on Update button")
	public void clickUpdateBtn() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@When("Click on Merge Lead link")
	public void clickMergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	
	@When("Enter From Lead")
	public void enterFromLead() throws InterruptedException {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("aa");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));

	}
	
	@When("Enter To Lead")
	public void enterToLead() throws InterruptedException {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ss");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));

	}
	
	@When("Click on Merge button")
	public void clickMergeLeadBtn() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();

	}
}
