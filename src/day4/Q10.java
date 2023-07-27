package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys("Mens T-shirt");
		driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'_2B099V')])[1]")).click();
		System.out.println("product name:"+driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).getAttribute("value"));
        System.out.println("Selected product:"+driver.findElement(By.xpath("(//div[contains(@class,'_2B099V')])[1]")).getText());
	    driver.quit();
	}

}
