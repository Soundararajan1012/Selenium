package day12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		WebElement phone=driver.findElement(By.cssSelector("input._2IX_2-.VJZDxU"));
		js.executeScript("arguments[0].setAttribute('value','9754376713')",phone);
		Thread.sleep(2000);
		WebElement request=driver.findElement(By.cssSelector("button._2KpZ6l._2HKlqd._3AWRsL"));
		js.executeScript("arguments[0].click();",request);
		System.out.println("username:"+driver.findElement(By.cssSelector("input._2IX_2-.VJZDxU")).getAttribute("value"));
		 
       
	}

}
