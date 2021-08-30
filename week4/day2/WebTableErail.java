package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableErail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement txtStationFrom = driver.findElement(By.id("txtStationFrom"));
		txtStationFrom.clear();
		txtStationFrom.sendKeys("ms");
		txtStationFrom.sendKeys(Keys.ENTER);

		WebElement txtStationTo = driver.findElement(By.id("txtStationTo"));
		txtStationTo.clear();
		txtStationTo.sendKeys("mdu");
		txtStationTo.sendKeys(Keys.ENTER);

		driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(5000);

		WebElement webTable = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		Thread.sleep(5000);

		List<WebElement> rowList = webTable.findElements(By.tagName("tr"));
		System.out.println("The count of the number of trains available : " + rowList.size());
		Thread.sleep(5000);

		List<String> trainNameList = new ArrayList<String>();

		for (int i = 0; i < rowList.size(); i++) {
			WebElement webElement1 = rowList.get(i);
			List<WebElement> columnList = webElement1.findElements(By.tagName("td"));
			String trainName = columnList.get(1).getText();
			trainNameList.add(trainName);

		}
		Collections.sort(trainNameList);

		for (String eachtrain : trainNameList) {
			System.out.println(eachtrain);

		}

	}

}
