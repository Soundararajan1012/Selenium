package day5;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Actions a=new Actions(driver);
        WebElement from=driver.findElement(By.xpath("//a[text()=' BANK ']"));
        WebElement to=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        a.dragAndDrop(from, to).build().perform();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Actions b=new Actions(driver);
        WebElement from1=driver.findElement(By.xpath(" //a[text()=' 5000']"));
        WebElement to1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        b.dragAndDrop(from1, to1).build().perform();
        Actions c=new Actions(driver);
        WebElement from2=driver.findElement(By.xpath("//a[text()=' SALES ']"));
        WebElement to2=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        c.dragAndDrop(from2, to2).build().perform();
        Actions d=new Actions(driver);
        WebElement from3=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
        WebElement to3=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        d.dragAndDrop(from3, to3).build().perform();
        
	}

}
