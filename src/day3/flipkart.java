package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");		
		//driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click();
        //driver.findElement(By.xpath("//span[text()='Existing User? Log in']")).click();
        driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9809098909");
        driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
        driver.findElement(By.xpath("//input[@autocomplete='on']")).sendKeys("456790");
        driver.findElement(By.cssSelector("button._2KpZ6l._2HKlqd._3AWRsL")).click();
//        driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
//        driver.findElement(By.xpath("//p[@style='animation: 52.7467ms ease 0s 1 normal none running textColorIReverse;']")).click();
//		
	}
	

}
