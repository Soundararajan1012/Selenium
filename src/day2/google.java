package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("input.gLFyf")).sendKeys(" GreensTechnology, Chennai");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		driver.findElement(By.xpath("//h3[text()='Greens Technologys: Best Software Training institutes in ...']")).click();

	}

}
