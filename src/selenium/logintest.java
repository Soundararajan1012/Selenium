package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch browser
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//load the url
		driver.get("https://www.fb.com");
		//click login button
		driver.findElement(By.id("email")).sendKeys("petricsibu@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("sibu@8295");
		driver.findElement(By.name("login")).click();

	}

}
