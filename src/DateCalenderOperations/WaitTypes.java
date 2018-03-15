package DateCalenderOperations;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitTypes {

	protected WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void ImplicitWait() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Selenium And Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		// Implicitly Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/test/guru99home/");

		// Explicitly Wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		ele.sendKeys(Keys.ENTER);
		ele.sendKeys(Keys.SPACE);
		ele.clear();
		ele.click();

		// Fluent Wait
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
		wait1.withTimeout(50, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				WebElement el = driver.findElement(By.xpath(""));
				return el;
			}
		});

		driver.close();
		driver.quit();

	}
}