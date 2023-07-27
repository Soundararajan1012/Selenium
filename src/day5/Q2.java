package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement prime=driver.findElement(By.xpath("//span[text()='Prime']"));
		a.moveToElement(prime).perform();
		a.click(prime).build().perform();
		
		

	}

}
