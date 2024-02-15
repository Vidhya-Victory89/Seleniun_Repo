package day4.ass4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://leafground.com/checkbox.xhtml");
        driver.findElement(By.id("j_idt87:j_idt89")).click();
        driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
        driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
        driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']//div[2]")).click();
        String stateHasBeen = driver.findElement(By.className("ui-growl-title")).getText();
        System.out.println("TriState CheckBox: "+stateHasBeen);
        if(stateHasBeen.contains("Checked"))
        {
        	 System.out.println("State Has Been Changed to State=1");
        }
        else
        {
        	 System.out.println("State Has Been Changed to State=2");
        }
        driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']//div[2]")).click();
        driver.findElement(By.xpath("//table[@id='j_idt87:basic']/tbody[1]/tr[1]/td[5]/div[1]/div[2]")).click();
        Boolean check=driver.findElement(By.id("j_idt87:j_idt102")).isEnabled();
        System.out.println("Verify if check box is disabled: "+check);
        if(check==true)
        {
        	System.out.println("The check box is disabled");
        }
        else
        {
        	System.out.println("The check box is not disabled:");
        }
       driver.findElement(By.id("j_idt87:multiple")).click();
       driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[1]/div[1]/div[2]")).click();     
       driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
       driver.close();
	}

}
