package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Actions a=new Actions(driver);
        WebElement baby1=driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
        a.click(baby1).build().perform();
        WebElement baby=driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']"));
        a.clickAndHold(baby).build().perform();
        WebElement toy=driver.findElement(By.xpath("//a[text()='Toys & School Supplies']"));
        a.moveToElement(toy).build().perform();
        WebElement toy1=driver.findElement(By.xpath("//a[text()='Baby Toys']"));
        a.click(toy1).build().perform();

	}

}
