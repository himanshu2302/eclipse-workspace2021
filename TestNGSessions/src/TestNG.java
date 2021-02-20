import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

	public static WebDriver driver;
	
	//before suite, test, class, method
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://www.google.com/");
	}

	@Test
	public void testTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
