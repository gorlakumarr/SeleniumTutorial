package DateCalenderOperations;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {

	protected WebDriver driver;

	@Test
	public void guru99tutorials() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Selenium And Drivers\\chromedriver.exe");

		System.getProperty("os.name").toLowerCase();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/test/guru99home/");

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		// Count is window Number which you want to Control
		int i = 1;
		int count = 5;
		while (itr.hasNext() && i < 10) {
			String string = (String) itr.next().toString();
			driver.switchTo().window(string);
			System.out.println(driver.getTitle());
			if (count == i) {
				break;

			} else {
				i++;
			}
		}

		driver.close();
		driver.quit();

	}
}