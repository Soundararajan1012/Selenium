package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[contains(@name,'keyword')])[1]")).sendKeys("Mens T-shirt");
		driver.findElement(By.xpath("//span[contains(@class,'searchTextSpan')]")).click();
		driver.findElement(By.xpath("(//a[contains(@class,'dp-widget-link noUdLine hashAdded')])[1]")).click();
	    System.out.println("product name:"+driver.findElement(By.xpath("(//input[contains(@name,'keyword')])[1]")).getAttribute("value"));
	    System.out.println("product selected:"+driver.findElement(By.xpath("(//a[contains(@class,'dp-widget-link noUdLine hashAdded')])[1]")).getText());
	    driver.quit();
	}

}
