package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Actions a=new Actions(driver);
        WebElement fashion1=driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
        a.click(fashion1).build().perform();
        WebElement fashion=driver.findElement(By.xpath("//div[text()='Fashion']"));
        a.clickAndHold(fashion).build().perform();
        WebElement women=driver.findElement(By.xpath("//a[text()='Women Footwear']"));
        a.moveToElement(women).build().perform();
        WebElement flat=driver.findElement(By.xpath("//a[text()='Women Flats']"));
        a.click(flat).build().perform();
        

	}

}
