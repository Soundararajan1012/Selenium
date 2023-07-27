package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("arun Kumar");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("arun12345");
		System.out.println("User Name:"+driver.findElement(By.xpath("//input[contains(@id,'username')]")).getAttribute("value"));
		System.out.println("Password:"+driver.findElement(By.xpath("//input[contains(@id,'password')]")).getAttribute("value"));
        driver.quit();

	}

}
