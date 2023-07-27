package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		driver.findElement(By.cssSelector("span.newUserRegister")).click();
		WebElement frm=driver.findElement(By.cssSelector("iframe#loginIframe"));
		driver.switchTo().frame(frm);
        driver.findElement(By.cssSelector("input#userName")).sendKeys("8990909009");
        driver.findElement(By.cssSelector("button#checkUser")).click();
        Thread.sleep(2000);
		driver.findElement(By.id("j_username_new")).sendKeys("rajan707@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"loginOtpUC\"]/div[1]/input")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.name("j_name")).sendKeys("surendar");
		driver.findElement(By.id("j_dob")).click();
		driver.findElement(By.xpath("//td[@class='day'][6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("j_password")).sendKeys("Rajan12345");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button#userSignup")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"registerOtp\"]/div[1]/input")).sendKeys("1234");
		driver.findElement(By.cssSelector("button#registerUser")).click();
	}
	

}
