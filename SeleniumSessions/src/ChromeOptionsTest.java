import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsTest {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");

		ChromeOptions chro = new ChromeOptions();
		chro.addArguments("disable-infobars");
		ChromeDriver driver = new ChromeDriver(chro);
		driver.get("https://www.spicejet.com/");
	}
}
