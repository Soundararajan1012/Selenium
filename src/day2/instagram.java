package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		//Directly instagram login
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=username]")).sendKeys("rajan123@gmail.com");
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("raja12345");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		//indirectlt login facebook
//		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
//		driver.findElement(By.id("email")).sendKeys("raja567@gmail.com");
//     	driver.findElement(By.id("pass")).sendKeys("raja123@");
//     	driver.findElement(By.cssSelector("button[name=login]")).click();
		
		
		

	}

}
