package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[contains(@id,'autocomplete')]")).sendKeys("Shoes for boys");
        driver.findElement(By.xpath("//a[contains(@class,'srch_action btn orange')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'//www.shopclues.com/misro-boys-casual-sports-shoes-152873428.html')]")).click();
	    System.out.println("product name:"+driver.findElement(By.xpath("//input[contains(@id,'autocomplete')]")).getAttribute("value"));
	    System.out.println("selected product:"+driver.findElement(By.xpath("//a[contains(@href,'//www.shopclues.com/misro-boys-casual-sports-shoes-152873428.html')]")).getText());
	}

}
