package DateCalenderOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HTTPSHandling {

	protected WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void guru99tutorials() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");

		System.getProperty("os.name").toLowerCase();

		new InternetExplorerDriver();

		// Firefox browser
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setAcceptUntrustedCertificates(true);
		firefoxProfile.setAssumeUntrustedCertificateIssuer(true);

		// Chrome

		new DesiredCapabilities();
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		new ChromeDriver(capabilities);

		// Internet Explorer Driver
		DesiredCapabilities capabilities1 = new DesiredCapabilities();
		capabilities1.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		WebDriver driver1 = new InternetExplorerDriver(capabilities1);

		driver1.close();
		driver1.quit();

	}
}