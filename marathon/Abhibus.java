package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();      
        driver.get("https://www.abhibus.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
        driver.findElement(By.xpath("//li[@data-id='Chennai']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
        driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
        Thread.sleep(3000);
         String Busname = driver.findElement(By.xpath("//h5[@class='title'][1]")).getText();
        System.out.println("Bus Name: "+Busname);
        driver.findElement(By.xpath("//div[@id='seat-filter-bus-type']/a[4]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'btn bus-info-btn')]")).click();
        String seatsAvailable = driver.findElement(By.xpath("//small[text()='26']")).getText();
        System.out.println("Seats Available: "+seatsAvailable);
        driver.findElement(By.xpath("//button[contains(@class,'btn bus-info-btn')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='L16']")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        String select = driver.findElement(By.xpath("//span[@class='text-primary']")).getText();
        String baseFare = driver.findElement(By.xpath("//span[text()='Base Fare :']")).getText();
        System.out.println("Seat Selected: "+select+"\n"+baseFare);
        String title=driver.getTitle();
        System.out.println("Title:" +title);
        driver.close();
	}

}
