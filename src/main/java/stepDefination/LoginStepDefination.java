package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import runner.TestRunner;

public class LoginStepDefination extends TestRunner {
	WebDriver driver;
	
	@Given("^user should be login page.$")
	public void user_should_be_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
			
			String title = driver.getTitle();
			   System.out.println(title);
			   Assert.assertEquals("Cogmento CRM", title);
			   System.out.println("1st hi..");
	}

	@When("^enter the login id and password$")
	public void enter_the_login_id_and_password() throws Throwable {
	    driver.findElement(By.name("email")).sendKeys("kamlesh195198@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Kamlesh@123");
	   
	   
	}

	
	@And("^click on login button.$")
	public void click_on_login_button() throws Throwable {
		
		 driver.findElement(By.xpath("//div[text()='Login']")).click();
	   
	}

	@Then("^home page must be display.$")
	public void home_page_must_be_display() throws Throwable {
		String title = driver.getTitle();
	   System.out.println(title);
	   driver.close();
	}


}
