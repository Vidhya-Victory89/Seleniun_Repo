package day6.assign6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AJIOListInterface {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();      
        driver.get("https://www.ajio.com/");
        driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
        Thread.sleep(3000);
        String ItemsFound=driver.findElement(By.xpath("//div[@class='length']//strong")).getText();
        System.out.println("Items Found: "+ItemsFound);
        List<WebElement> Brand=driver.findElements(By.xpath("//div[@class='brand']"));
        List <WebElement> BagN=driver.findElements(By.xpath("//div[@class='nameCls']"));
        List<String> BagBrand=new ArrayList<String>();
        List<String> BagName=new ArrayList<String>();
        for (WebElement  a: Brand) {
			String text=a.getText();
			BagBrand.add(text);
        }
        System.out.println("Bag Brand Name: ");
        System.out.println(BagBrand);
        for(WebElement b:BagN)
        {
        	String text1=b.getText();
			BagName.add(text1);
        }
        System.out.println("Bag Name: ");
        System.out.println(BagName);
	}

}
