package week2.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		System.out.println("I am suppose to go " + driver
				.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));

		WebElement verifyBrokn = driver.findElement(By.linkText("Verify am I broken?"));
		verifyBrokn.click();
		String brkn1 = driver.getTitle();
		String brkn2 = "HTTP Status 404 – Not Found";
		System.out.println(brkn1);
		if (brkn1.equals(brkn2))
			System.out.println("Page is broken");
		else
			System.out.println("Page is not broken");
		driver.navigate().back();

		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		driver.navigate().back();

		System.out.println(driver.findElements(By.tagName("a")).size());

		// Href of first link stored as link
		String link1 = driver.findElement(By.linkText("Go to Home Page")).getAttribute("href");
		// Href of second link stored as link
		String link2 = driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).getAttribute("href");

		if (link1.equals(link2)) {
			System.out.println("Click First Link " + link1);
			driver.get(link1);
			System.out.println("Print title of the page " + driver.getTitle());

		} else
			System.out.println("Click Second Link " + link2);

	}

}
