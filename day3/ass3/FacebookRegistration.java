package day3.ass3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        String title=driver.getTitle();
        System.out.println(title);
        if(title.contains("Facebook – log in or sign up"))
      	{
        	System.out.println("Create Account Page is Opened");   	 	
  		}
        else
        {
        	System.out.println("Create Account Page is not Opened");
        }
        driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("Vidhya");
        driver.findElement(By.name("firstname")).sendKeys("Vidhya");
        driver.findElement(By.name("lastname")).sendKeys("Rajasekaran");
        driver.findElement(By.name("reg_email__")).sendKeys("vithravictory89@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vithravictory89@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("vidhya@R");    
        WebElement data1 = driver.findElement(By.id("day"));
        Select day=new Select(data1);
        day.selectByVisibleText("14");
        WebElement data2 = driver.findElement(By.id("month"));
        Select month=new Select(data2);
        month.selectByVisibleText("Apr");
        WebElement data3 = driver.findElement(By.id("year"));
        Select year=new Select(data3);
        year.selectByVisibleText("1990");
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.close();
	}

}
