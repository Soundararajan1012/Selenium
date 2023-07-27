package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value='soundar@gmail.com';");
		js.executeScript("document.getElementById('pass').value='soundar123@';");
		WebElement login=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();",login);

	}

}
