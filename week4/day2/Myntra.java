package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Move Hover on Men
		WebElement webMen = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(webMen).perform();

		// Click Jackets
		driver.findElement(By.xpath("//a[text()='Jackets']")).click();

		// Total count of item
		String totalCountItem = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("Total Count of Item : " + totalCountItem);

		// Validate the sum of categories count matches
		String repItem = totalCountItem.replaceAll("[^0-9]", "");
		System.out.println(repItem);
		int sumRepItem = Integer.parseInt(repItem);

		String jackCount = driver.findElement(By.xpath("//label[text()='Jackets']")).getText();
		String rainJackCount = driver.findElement(By.xpath("//label[text()='Rain Jacket']")).getText();
		System.out.println(jackCount + " " + rainJackCount);
		String repJackCount = rainJackCount.replaceAll("[^0-9]", "");
		String repRainJackCount = jackCount.replaceAll("[^0-9]", "");
		int repJackCount1 = Integer.parseInt(repJackCount);
		System.out.println(repJackCount1);
		int repRainJackCount1 = Integer.parseInt(repRainJackCount);
		System.out.println(repRainJackCount1);

		int sum = repJackCount1 + repRainJackCount1;
		System.out.println("Sum of two counts " + sum);

		if (sum == sumRepItem) {
			System.out.println("Counts Matches");
		} else {
			System.out.println("Count not matches");
		}

		// click on jackets
		driver.findElement(By.xpath("//label[contains(text(),'Jackets')]")).click();
		Thread.sleep(2000);

		// Click on brand more
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		Thread.sleep(2000);

		// Type Duke and click checkbox
		driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Duke']")).click();
		Thread.sleep(2000);

		// Close the pop-up
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();

		// Get all the coats and store in a list
		List<WebElement> coatList = driver.findElements(By.xpath("//h3[@class='product-brand']"));

		for (int i = 0; i < coatList.size(); i++) {
			String text = coatList.get(i).getText();
			if (text.equals("Duke")) {
				System.out.println("All Products are of Duke Brand " + text);
			} else {
				System.out.println("All products are not of Duke Brand");
			}

		}

		// Sort by better Discount
		WebElement bestRecmdPrice = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		Actions builder1 = new Actions(driver);
		builder.moveToElement(bestRecmdPrice).perform();

		driver.findElement(By.xpath("//label[text()='Better Discount']")).click();
		Thread.sleep(2000);

		// find the price of first displayed item
		String priceOfProduct = driver.findElement(By.xpath("//span[@class='product-discountedPrice']")).getText();
		System.out.println("The price of the first selected product is : " + priceOfProduct);

		// Click on the first displayed product
		driver.findElement(By.xpath("//span[@class='product-discountedPrice']")).click();
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandlesSet);
		driver.switchTo().window(windowHandlesList.get(1)); // Get handle of Child window

		// To take a screen of the selected product
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snaps/seat.png");
		FileUtils.copyFile(src1, dst);

		// Click on WishList button
		driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
