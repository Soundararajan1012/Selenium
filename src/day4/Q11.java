package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.cssSelector("input._2IX_2-.VJZDxU")).sendKeys("9754376713");
        driver.findElement(By.cssSelector("button._2KpZ6l._2HKlqd._3AWRsL")).click();
        System.out.println("username:"+driver.findElement(By.cssSelector("input._2IX_2-.VJZDxU")).getAttribute("value"));
	}

}
