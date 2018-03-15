package javaStringOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void DemoClass() {

		ChromeDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();

		driver.get("");

		driver1.get("");

	}

}
