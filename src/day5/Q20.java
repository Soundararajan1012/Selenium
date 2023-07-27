package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q20 {

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
        WebElement baby=driver.findElement(By.xpath("//div[text()='Electronics']"));
        a.clickAndHold(baby).build().perform();
        WebElement toy=driver.findElement(By.xpath("//a[text()='All']"));
        a.click(toy).build().perform();
        WebElement toy1=driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
        a.clickAndHold(toy1).build().perform();
        WebElement toy2=driver.findElement(By.xpath("//a[text()='Mi']"));
        a.click(toy2).build().perform();
        WebElement toy3=driver.findElement(By.xpath("//div[text()='Mi 5A 100 cm (40 inch) Full HD LED Smart Android TV with Dolby Audio (2022 Model)']"));
        a.click(toy3).build().perform();

	}

}
