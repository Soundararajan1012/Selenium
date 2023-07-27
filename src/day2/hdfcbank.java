package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfcbank {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		Thread.sleep(2000);
		
		WebElement frame= driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame);
     	driver.findElement(By.cssSelector("input[type=text]")).sendKeys("123456");
   	    
        driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
//        driver.findElement(By.xpath("//a[text()='Forgot Customer ID']")).click();
		//driver.findElement(By.xpath("//input[@place-holder='Customer ID/ User ID']")).sendKeys("789876");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#fldPasswordDispId")).sendKeys("rajan9087#");
        //driver.findElement(By.cssSelector("label.ng-binding.ng-scope")).click();
   	    driver.findElement(By.cssSelector("a.btn.btn-primary.login-btn")).click();
	}

}
