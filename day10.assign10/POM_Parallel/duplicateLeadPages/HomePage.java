package duplicateLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;



public class HomePage extends POMBaseClass {
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyHomePage clickCrmsfa()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
		
	}
	public HomePage clickLogOut()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
		
	}

}
