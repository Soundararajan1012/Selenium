package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.id("mobile")).sendKeys("9087654321");
		driver.findElement(By.id("name")).sendKeys("raja");
		driver.findElement(By.id("email")).sendKeys("shanraja9087@gmail.com");
		driver.findElement(By.cssSelector("a.a-ayg")).click();
		driver.findElement(By.cssSelector("input#otp")).sendKeys("678907");
		driver.findElement(By.cssSelector("a.a-ayg")).click();

	}

}
