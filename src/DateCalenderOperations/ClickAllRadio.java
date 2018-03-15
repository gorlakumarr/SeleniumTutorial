package DateCalenderOperations;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickAllRadio {
	private WebDriver driver;

	@Test
	public void dateformat() {

		System.setProperty("webdriver.chrome.driver", ".\\Selenium And Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		List<WebElement> list = driver.findElements(By.xpath(""));
		// for loop
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getAttribute("value").equals("")) {
				list.get(i).click();

			}

		}
		// for each loop
		for (WebElement webElement : list) {
			webElement.click();
		}

		// Iterator
		Iterator<WebElement> itr = list.iterator();
		while (itr.hasNext()) {
			WebElement webElement = (WebElement) itr.next();
			webElement.click();
		}

	}

}
