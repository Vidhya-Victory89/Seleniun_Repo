package mergeLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;



public class LoginPage extends POMBaseClass {
	
     public LoginPage enterUserName(String username)
     {
    	driver.findElement(By.id("username")).sendKeys(username);
		return this;
    	 
     }
     public LoginPage enterPassword(String password)
     {
    	 driver.findElement(By.id("password")).sendKeys(password);
    	 return this; 
     }
     public HomePage clickLoginButton()
     {
    	 driver.findElement(By.className("decorativeSubmit")).click();
    	 return new HomePage();
     }

}
