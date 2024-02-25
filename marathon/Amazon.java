package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();      
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for b");
        driver.findElement(By.xpath("//span[@class='s-heavy']")).click();
        String Result1 = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]//span")).getText();
        String Result2 = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
        System.out.println("Result: "+Result1 + Result2 );
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
        driver.findElement(By.xpath("//li[@id='p_89/Gear']/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
        driver.findElement(By.xpath("//span[text()='Last 30 days']")).click();
        String bagname = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']")).getText();
        String discountprice = driver.findElement(By.xpath("//span[text()='(56% off)']")).getText();
        System.out.println("BagName: "+bagname);
        System.out.println("Discount: "+discountprice);
        String title=driver.getTitle();
        System.out.println("Title: "+title);
        driver.close();
	}

}
