package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("rajan");
        driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("rajan1234");
        System.out.println("Username:"+driver.findElement(By.xpath("//input[contains(@id,'email')]")).getAttribute("value"));
        System.out.println("Password:"+driver.findElement(By.xpath("//input[contains(@id,'pass')]")).getAttribute("value"));
        driver.quit();
	}

}
