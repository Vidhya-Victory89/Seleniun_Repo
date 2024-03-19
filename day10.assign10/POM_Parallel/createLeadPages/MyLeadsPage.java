package createLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;



public class MyLeadsPage extends POMBaseClass {
	public MyLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public ViewLead CheckLeadCreation()
	{
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	if (text.contains("Testleaf")) {
		System.out.println("Lead created successfully");
	}
	else {
		System.out.println("Lead is not created");
	}
	return new ViewLead(driver);

}
}
