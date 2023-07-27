package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hotelreservation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(" http://adactinhotelapp.com/");
		driver.findElement(By.cssSelector("input#username")).sendKeys("rajesndren");
		driver.findElement(By.cssSelector("input#password")).sendKeys("rajesh122");
		driver.findElement(By.cssSelector("input#login")).click();
//		//forgotten password
//		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
//        driver.findElement(By.cssSelector("input#emailadd_recovery")).sendKeys("rajendren@gmail.com");
//        driver.findElement(By.cssSelector("input#Submit")).click();
//        driver.findElement(By.xpath("//a[text()='Go back to Login page']")).click();
        //create registered user
//		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
//		driver.findElement(By.cssSelector("input#username")).sendKeys("rajeshkumar");
//		driver.findElement(By.cssSelector("input#password")).sendKeys("kumar123");
//		driver.findElement(By.cssSelector("input#re_password")).sendKeys("kumar123");
//		driver.findElement(By.cssSelector("input#full_name")).sendKeys("rajeshkumar");
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("input#email_add")).sendKeys("rajesh123@gmail.com");
//		//driver.findElement(By.cssSelector("//*[@id=\"change-image\"]/img")).click();
//		Thread.sleep(7000);
//		driver.findElement(By.cssSelector("input#captcha-form")).sendKeys(" ");
//		driver.findElement(By.cssSelector("input#tnc_box")).click();
//		driver.findElement(By.cssSelector("input#Submit")).click();
//		driver.findElement(By.xpath("//a[text()='Go back to Login page']")).click();
		
	}

}
