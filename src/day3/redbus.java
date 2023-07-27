package day3;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//i[@id='i-icon-profile']")).click();
		driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
		Thread.sleep(2000);
		WebElement frm=driver.findElement(By.cssSelector("iframe.modalIframe"));
		driver.switchTo().frame(frm);
		driver.findElement(By.xpath("//input[@data-message='Please enter valid mobile number|Please enter valid mobile number']")).sendKeys("8909090900");
//		Thread.sleep(40000);
//		driver.findElement(By.cssSelector("span.f-w-b")).click();
//		driver.findElement(By.cssSelector("input[id=otp]")).sendKeys("560980");
//		driver.findElement(By.cssSelector("button[id=verifyUser]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement frm1=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div[3]/iframe"));
		driver.switchTo().frame(frm1);
		Thread.sleep(3000);
		WebElement frm2=driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
		driver.switchTo().frame(frm2);
		WebElement click1=driver.findElement(By.xpath("//*[@id='container']/div/div[2]/span[1]"));
		click1.click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rajan123@gmail.com");
		//driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
		String window1=driver.getWindowHandle();
		Set<String> window2=driver.getWindowHandles();
		for(String window3:window2)
		{
			if(!window3.equals(window1)) {
				driver.switchTo().window(window3);
		driver.findElement(By.id("identifierId")).sendKeys("rajan234@gmail.com");
		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
	}
		}
	}

}
