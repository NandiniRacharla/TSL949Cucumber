package stepDefination;

import java.util.jar.Attributes.Name;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class FrontSteps {
	WebDriver driver;

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void after() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Given("User is on Login Page")
	public void user_is_on_login_page() throws Exception {
		driver.get("http://demo.frontaccounting.eu/");
		Thread.sleep(3000);
	}

	@When("user enters username as {string} & password as {string} & clicks on login")
	public void user_enters_username_as_password_as_clicks_on_login(String uname, String pwd) throws Exception {
		driver.findElement(By.name("user_name_entry_field")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("user_name_entry_field")).sendKeys(uname);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("SubmitUser")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("login {string} should happen")
	public void login_should_happen(String status) {
		if (status.equals("should")) {
			if (driver.getTitle().equals("Main Menu")) {
				System.out.println("Positive test pass");
			} else {
				System.out.println("Positive test failed");
				Assert.fail("positive test failed");
			}
		}

		else {
			if (driver.getTitle().equals("Main menu")) {
				System.out.println("Negative Test Failed");
			} else {
				System.out.println("Negative test pass");
			}
		}

		System.out.println("Done");
	}

}