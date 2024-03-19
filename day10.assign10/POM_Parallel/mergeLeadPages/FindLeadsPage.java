package mergeLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;

public class FindLeadsPage extends POMBaseClass {
	public FindLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public FindLeadsPage sendLeadID()
	{
    System.out.println(FindLeadsWindowPage.leadID);
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(FindLeadsWindowPage.leadID);
	return this;
	}
	public FindLeadsPage clickFindLeadsButton()
	{
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	return this;
	}
	public FindLeadsPage displayRecords()
	{
	String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}
	return this;	
	}
}
