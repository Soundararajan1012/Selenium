package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookdropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
//		driver.findElement(By.name("email")).sendKeys("rajan@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("123435678");
//		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.id("identify_email")).sendKeys("rajan@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("56784321");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='1']")).click();
		driver.findElement(By.xpath("//a[@class='_9o1v']")).click();

	}

}

