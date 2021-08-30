package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableErail {

	public static void main(String[] args) {
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

		WebElement webTable = driver.findElement(By.id("DataTable TrainList TrainListHeader"));

		List<WebElement> rowList = webTable.findElements(By.tagName("tr"));
		System.out.println("The count of the number of trains available : " + rowList.size());

		for (int i = 0; i < rowList.size(); i++) {
			WebElement webElement1 = rowList.get(i);
			List<WebElement> trainName = webElement1.findElements(By.tagName("td"));
			trainName.get(2).getText();
			System.out.println(trainName);

		}
	}

}
