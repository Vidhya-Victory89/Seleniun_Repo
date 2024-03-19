package duplicateLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;



public class HomePage extends POMBaseClass {
	
	public MyHomePage clickCrmsfa()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
		
	}
	public HomePage clickLogOut()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
		
	}

}
