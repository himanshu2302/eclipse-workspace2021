import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	WebDriver driver;
	String sheetName  = "facebookdata";

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	@DataProvider
	public Object[][] getTestData() {
		Object[][] data = Utils.getData(sheetName);
		return data;
	}

	@Test(dataProvider="getTestData")
	public void createTestData(String firstname, String surname, String mobile, String password) {
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(surname);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(mobile);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(password);
	}





	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
