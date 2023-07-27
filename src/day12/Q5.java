package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('username').value='soundar@gmail.com';");
		js.executeScript("document.getElementById('password').value='soundar123@';");
		WebElement login=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();",login);

	}

}
