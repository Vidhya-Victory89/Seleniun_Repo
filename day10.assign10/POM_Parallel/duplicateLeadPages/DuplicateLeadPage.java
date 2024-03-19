package duplicateLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;

public class DuplicateLeadPage extends POMBaseClass {
	public DuplicateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
    public ViewLeadPage clickSubmit()
    {
    	driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
    }
}
