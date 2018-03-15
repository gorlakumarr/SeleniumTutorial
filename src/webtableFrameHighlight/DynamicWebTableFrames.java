package webtableFrameHighlight;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DynamicWebTableFrames {

	private static final Object ele = null;
	protected WebDriver driver;

	@Test
	public void WebtableFramestutorials() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\Selenium And Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/test/guru99home/");

		// Static Table
		for (int numberOfRows = 1; numberOfRows <= 5; numberOfRows++) {
			for (int numberOfColumns = 1; numberOfColumns <= 5; numberOfColumns++) {
				System.out.println(driver.findElement(By.xpath("//div[@id='main']/table[1]/tbody/tr\r\n" + "7\r\n" + "["
						+ numberOfRows + "]/th[" + numberOfColumns + "]")));

			}

		}
		// Dynamic Table
		WebElement htmltable = driver.findElement(By.xpath("//*[@id='main']/table[1]/tbody"));
		List<WebElement> rows = htmltable.findElements(By.tagName("tr"));
		List<WebElement> columns = htmltable.findElements(By.tagName("td"));

		for (int i = 0; i < rows.size(); i++) {
			for (int j = 0; j < columns.size(); j++) {
				System.out.println(columns.get(j));
				String str = columns.get(j).getText();

				if (str.equalsIgnoreCase(str)) {
					columns.get(j).click();
					break;

				}
			}

		}

		// Frames
		driver.switchTo().frame(0);
		driver.switchTo().frame("name");
		driver.switchTo().frame("Jfgsdf");
		driver.switchTo().frame((WebElement) By.tagName("iframe"));

		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();
		alert.sendKeys("jafksjfbksjfs");

		// Highlight the text and get the color
		System.out.println(driver.findElement(By.xpath("")).getCssValue("color"));
		System.out.println(driver.findElement(By.xpath("")).getCssValue("background-color"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object username = null;
		executor.executeScript("arguments[0].setAttribute('style,'border: solid 2px red'');", username);

		// Click An Element
		WebElement element = driver.findElement(By.id("gbqfd"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element);
		executor1.executeScript("arguments[0].scrollIntoView(true)", ele);
		executor1.executeScript("windows.scrollBy(280,200)", ele);

		// Robot Class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F20);
		robot.keyRelease(KeyEvent.VK_F20);

		// Actions Class
		Actions actions = new Actions(driver);
		WebElement el1 = null, el2 = null;
		actions.dragAndDrop(el1, el2);
		actions.build().perform();

		//
		actions.contextClick(el1).build().perform();
		actions.doubleClick(el2).build().perform();

		driver.close();
		driver.quit();

	}
}