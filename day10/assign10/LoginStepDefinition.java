package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass {
	
	/*@Given("Launch the browser and Load the URL")
	public void precondition()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}*/
	@When("Enter the UserName as {string}")
	public void enterUserName(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@And("Enter the Password as {string}")
	public void enterPassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@And("Click on the LoginButton")
	public void clickLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Homepage should be displayed")
	public void verifyHomePage()
	{
		String title=driver.getTitle();
		if(title.contains("Automation"))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Not Successful");
		}
	}
	@But("Homepage should not be displayed")
	public void verify()
	{
		String title=driver.getTitle();
		if(title.contains("Automation"))
		{
			System.out.println("Login Not Successful");
		}
		else
		{
			System.out.println("Login Successful");
		}
	}
}
