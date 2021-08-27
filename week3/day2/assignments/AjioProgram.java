package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioProgram {

	/**
	 * 1. Launch the URL "https://www.ajio.com/" 
	 * 2. In the search box, type as "bags" and press enter 
	 * 3. To the left of the screen under " Gender" click the "Men"
	 * 4. Under "Category" click "Fashion Bags"
	 * 5. Print the count of the items Found.
	 * 6. Get the list of brand of the products displayed in the page and print the list.
	 * 7. Get the list of names of the bags and print it 
	 * @param args
	 * @throws InterruptedException
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement searchBags = driver.findElement(By.xpath("//input[@name=\"searchVal\"]"));
		searchBags.sendKeys("Bags");
		searchBags.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[@for=\"Men\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for=\"Men - Fashion Bags\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"filter\"]/div"));
		List<WebElement> brandList = driver.findElements(By.xpath("//div[@class=\"brand\"]"));
		System.out.println("List of Brand names are as follows : ");
		Set<String> setOfBags = new LinkedHashSet<String>();
		
		for (WebElement eachbrand : brandList) {
			String brandName = eachbrand.getText();
			System.out.println(brandName);
			setOfBags.add(brandName);
			
		}
		System.out.println(brandList.size());
		System.out.println("List of Brand names without duplicates are as follows : " + setOfBags);
		System.out.println(setOfBags.size());
		
		System.out.println("List of Bag Names");
		List<WebElement> bagNameList = driver.findElements(By.xpath("//div[@class=\"name\"]"));
		for (WebElement eachBagName : bagNameList) {
			String text = eachBagName.getText();
			System.out.println(text);
		}
			
		}

	}
