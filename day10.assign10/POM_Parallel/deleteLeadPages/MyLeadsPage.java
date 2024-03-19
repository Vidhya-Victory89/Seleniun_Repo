package deleteLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;

public class MyLeadsPage extends POMBaseClass {
	public 	MyLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyLeadsPage clickFindLeads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return this;
	}
	public MyLeadsPage enterLeadID()
	{
    //FindLeadsPage f=new FindLeadsPage(driver);
    System.out.println(FindLeadsPage.leadID);
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(FindLeadsPage.leadID);
	return this;
	}
	public MyLeadsPage clickFindLeadsButton()
	{
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	System.out.println(text);
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}
	return this;
	}

}
