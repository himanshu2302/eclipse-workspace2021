import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNavigateCommands {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.google.com/");
	
	//navigating to facebook		
	driver.navigate().to("https://www.facebook.com/");
	
	//navigating back to google 
	driver.navigate().back();
	
	//navigating forward to facebook
	driver.navigate().forward();
	
	Thread.sleep(3000);
	
	//refreshing the current web page
	driver.navigate().refresh();
}
}
