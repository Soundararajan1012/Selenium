package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='home-tab']")).click();
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.xpath("//p[contains(text(),'Velmurugan currently focuses on teaching and delivering')]"));
		//WebElement a=driver.findElement(By.xpath("//p[contains(@class,'red_text')]"));
		System.out.println("Text contains is:"+a.getText());
        //driver.quit();
	}

}
