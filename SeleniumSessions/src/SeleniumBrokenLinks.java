import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrokenLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		System.out.println(elements.size());
		
		for (WebElement webElement : elements) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}
}
