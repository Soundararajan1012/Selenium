package Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement frame1= driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("567809");
        driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
        driver.findElement(By.xpath("//input[@id='keyboard']")).sendKeys("rajan9098");
        

	}

}
