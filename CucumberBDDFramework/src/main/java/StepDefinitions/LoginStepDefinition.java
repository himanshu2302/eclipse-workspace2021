package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	static WebDriver  driver;

	@Given("^url is launched$")
	public void urlLaunched() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.247.130.39:8080/stream-zk/login.zul");	
	}

	@When("^user is on login page$")
	public void loginPage() {
		String title = driver.getTitle();
		Assert.assertEquals("Sapiens ClaimsPro", title);
	}

	@Then("^user enters username and password$")
	public void entersUsernameandPassword() {
		driver.findElement(By.xpath("//span[text()='Login ID']/../../following-sibling::td//input")).sendKeys("bfittes");
		driver.findElement(By.xpath("//span[text()='Password']/../../following-sibling::td//input")).sendKeys("password");

	}

	@Then("^user clicks on login button$")
	public void clickOnLogin() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws InterruptedException {
		Thread.sleep(10000);
		String text = driver.findElement(By.xpath("//span[text()='Welcome, Brad Farlow']")).getText();
		Assert.assertEquals("Welcome, Brad Farlow", text);
		System.out.println("User if verified and user is :" +text);
	}

	@When("^user is on create claim page$")
	public void user_is_on_create_claim_page() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Claims Management']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Create Claim']")).click();
	}

	@Then("^user enters date of occurrence$")
	public void user_enters_date_of_occurrence() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Date') and contains(text(),'of') and contains(text(),'Occurrence')]/../following-sibling::div//input")).sendKeys("02/10/2019");
	}

	@Then("^user enters policy number for PA claim$")
	public void user_enters_policy_number_for_PA_claim() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[contains(text(),'Report') and contains(text(),'By') and contains(text(),'Policy')]/../../../../../following-sibling::div[1]//span[contains(text(),'Policy') and contains(text(),'Number')]/../following-sibling::div//input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Report') and contains(text(),'By') and contains(text(),'Policy')]/../../../../../following-sibling::div[1]//span[contains(text(),'Policy') and contains(text(),'Number')]/../following-sibling::div//input")).sendKeys("PA2000222");
	}

	@Then("^user clicks on search icon$")
	public void user_clicks_on_search_icon() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Report') and contains(text(),'By') and contains(text(),'Policy')]/../../../../../following-sibling::div[1]/div/div[1]//a[@title='Search']")).click();
	}

	@Then("^user provides the notification details$")
	public void user_provides_the_notification_details() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Phone') and contains(text(),'Type')]/../../../preceding-sibling::div//input")).sendKeys("Himanshu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Phone') and contains(text(),'Type')]/../following-sibling::div//input")).sendKeys("Cellular");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Phone') and contains(text(),'Number')]/../following-sibling::div//input")).sendKeys("9752624218");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Source')]/../following-sibling::div//input")).sendKeys("Other");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Method')]/../following-sibling::div//input")).sendKeys("Other");
	}

	@Then("^user clicks on initiate button$")
	public void user_clicks_on_initiate_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Initiate']")).click();
	}

	@Then("^user clickc on continue to add new button$")
	public void user_clickc_on_continue_to_add_new_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Continue to Add New']")).click();
	}

	@Then("^user saves the claim number$")
	public void user_saves_the_claim_number() throws InterruptedException {
		Thread.sleep(5000);
		String claimNumber = driver.findElement(By.xpath("//span[contains(text(),'Claim') and contains(text(),'Number')]/../following-sibling::div//span")).getText();
		System.out.println("Claim Number is : "+claimNumber);
	}
}
