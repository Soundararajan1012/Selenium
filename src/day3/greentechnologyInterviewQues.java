package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class greentechnologyInterviewQues {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[contains(text(),'Interview Questions')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CTS Interview Question')] ")).click();

	}

}
