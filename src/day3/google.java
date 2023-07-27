package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.id("firstName")).sendKeys("soundara");
		driver.findElement(By.id("lastName")).sendKeys("rajan");
		driver.findElement(By.id("username")).sendKeys("rajan1012msc");
		driver.findElement(By.name("Passwd")).sendKeys("rajan1012@");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("rajan1012@");
		driver.findElement(By.id("selectioni1")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.cssSelector("input.VfPpkd-fmcmS-wGMbrd")).sendKeys("8909090909");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.id("code")).sendKeys("567890");
		driver.findElement(By.xpath("//span[text()='Verify']")).click();
		//another way to signin
//		driver.findElement(By.xpath("//span[text()='Sign in instead']")).click();
//		driver.findElement(By.id("identifierId")).sendKeys("rajan123@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		

	}

}
