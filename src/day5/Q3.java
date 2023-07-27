package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Actions a=new Actions(driver);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement home=driver.findElement(By.xpath("//div[text()='Home']"));
		a.moveToElement(home).build().perform();
		WebElement homefurnishing=driver.findElement(By.xpath("//a[text()='Home Furnishings']"));
		a.moveToElement(homefurnishing).build().perform();
		WebElement bathlinen=driver.findElement(By.xpath("//a[text()='Bath linen']"));
		a.click(bathlinen).build().perform();
		driver.findElement(By.xpath("//a[text()='My New Born Pink Free Size Bath Robe']")).click();
		System.out.println("Product Name:"+driver.findElement(By.xpath("//a[text()='My New Born Pink Free Size Bath Robe']")).getText());
	}

}
