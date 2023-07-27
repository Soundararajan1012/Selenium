package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		driver.findElement(By.xpath("//input[contains(@class,'gLFyf')]")).sendKeys("greens velmurugan");
		driver.findElement(By.xpath("(//input[contains(@class,'gNO89b')])[2]")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'Velmurugan K - Technical Manager - GTL Limited')]")).click();
        
	}

}
