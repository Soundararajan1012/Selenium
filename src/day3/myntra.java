package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.findElement(By.cssSelector("input.form-control.mobileNumberInput")).sendKeys("8909090900");
		driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
        Thread.sleep(40000);
        driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
		driver.findElement(By.cssSelector("input[name=otp0]")).sendKeys("3");
		driver.findElement(By.cssSelector("input[name=otp1]")).sendKeys("6");
		driver.findElement(By.cssSelector("input[name=otp2]")).sendKeys("7");
		driver.findElement(By.cssSelector("input[name=otp3]")).sendKeys("5");
	}

}
