package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class icici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		//user id and password
		driver.findElement(By.cssSelector("span.input-arrow")).click();
		driver.findElement(By.cssSelector("input.login-input.type_UserPrincipal")).sendKeys("kumar123");
		driver.findElement(By.cssSelector("input.login-input-password")).sendKeys("kumar89@");
		driver.findElement(By.xpath("//div[text()='Dashboard']")).click();
		driver.findElement(By.xpath("//a[text()='Bank Account']")).click();
		driver.findElement(By.cssSelector("input[value=Login]")).click();
		
		
		//Registered mobile number
//		driver.findElement(By.xpath("//span[@id='HDisplayDefault.Rb16.C2']")).click();
//		driver.findElement(By.xpath("//input[@title='Registered Mobile Number']")).sendKeys("7865456732");
//        driver.findElement(By.xpath("//input[@name='Action.RIB_VALIDATE_MOBILE_LOGIN']")).click();
	}

}
