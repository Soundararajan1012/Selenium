package day2;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@placeholder='Enter your delivery location']")).sendKeys("porur");
		driver.findElement(By.xpath("//span[text()='Locate Me']")).click();
		//driver.findElement(By.xpath("//button[@tabindex='3']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector(null)))
		//driver.findElement(By.xpath("//span[text()='FIND FOOD']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']")).sendKeys("dindigul thalapakatti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Restaurant']")).click();
		//driver.findElement(By.xpath("//div[text()='Dindigul Thalappakatti']")).click();
		//driver.findElement(By.xpath("//span[text()='Dishes']")).click();
//		driver.findElement(By.xpath("//div[text()='Restaurant']")).click();
//        driver.findElement(By.xpath("//div[text()='Dindigul Thalappakatti']")).click();
	}

}
