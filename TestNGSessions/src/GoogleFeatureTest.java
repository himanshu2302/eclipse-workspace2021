import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleFeatureTest {

	WebDriver driver;

	@BeforeMethod
	@Parameters({"url"})
	public void setup(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}

	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}

	@Test
	public void googleMailLinkTest() {
		WebElement mailLink = driver.findElement(By.xpath("//a[text()='Gmail']"));
		System.out.println(mailLink.getText());
		boolean b = mailLink.isDisplayed();
		Assert.assertEquals(b, true);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
