package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//Login
		driver.findElement(By.id("email")).sendKeys("raja567@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("raja123@");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		//forgot password
//		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
//		driver.findElement(By.id("identify_email")).sendKeys("rajan@gmail.com");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Continue']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("56784321");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@value='1']")).click();
//		driver.findElement(By.xpath("//a[@class='_9o1v']")).click();
		//create account
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("soundar");
//		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("rajan");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[name=reg_email__]")).sendKeys("soundar@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("soundar@gmail.com");
//		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("ramesh321@");
//		Thread.sleep(2000);
//		WebElement day=driver.findElement(By.cssSelector("select#day"));
//		Select daydd=new Select(day);
//		daydd.selectByIndex(9);
//		WebElement month=driver.findElement(By.cssSelector("select#month"));
//		Select monthdd=new Select(month);
//		monthdd.selectByVisibleText("Dec");
//		WebElement year=driver.findElement(By.cssSelector("select#year"));
//		Select yeardd=new Select(year);
//		yeardd.selectByValue("1998");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//label[text()='Male']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
//		Thread.sleep(7000);
//		driver.findElement(By.cssSelector("input#recovery_code_entry")).sendKeys("165782");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@value='1']")).click();

	}

}
