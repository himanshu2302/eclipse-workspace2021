import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestNG {

	@BeforeMethod
	public void enterUrl() {
		System.out.println("Enter Url");
	}

	@Test(priority=1)
	public void googleTitleTest() {
		System.out.println("Google title test");
	}

	@Test(priority=1)
	public void googleLogoTest() {
		System.out.println("Google logo test");
	}

	@Test
	public void googleMailTest() {
		System.out.println("Google mail test");
	}

	@AfterMethod
	public void logout() {
		System.out.println("Logout from app");
	}
}
