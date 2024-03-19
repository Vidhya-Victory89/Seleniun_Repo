package createLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;



public class CreateLeadPage extends POMBaseClass {
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");	
		return this;
	}
	public CreateLeadPage enterFirstName()
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Latha");
		return this;
	}
	public CreateLeadPage enterLastName()
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajasekaran");
		return this;
	}
	public CreateLeadPage enterPhoneNumber()
	{
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		return this;
	}
	public MyLeadsPage clickSubmitButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new MyLeadsPage(driver);
	}

}
