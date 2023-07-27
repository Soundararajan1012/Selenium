package day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q5 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Actions a=new Actions(driver);
		Robot b=new Robot();
		WebElement courses=driver.findElement(By.xpath("//a[text()='COURSES']"));
		a.clickAndHold(courses).build().perform();
		driver.findElement(By.xpath("//span[text()='Python']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4500)");
        WebElement explore=driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
		Thread.sleep(2000);
        a.contextClick(explore).build().perform();
        b.keyPress(KeyEvent.VK_DOWN);
        b.keyRelease(KeyEvent.VK_DOWN);
        b.keyPress(KeyEvent.VK_DOWN);
        b.keyRelease(KeyEvent.VK_DOWN);
        b.keyPress(KeyEvent.VK_ENTER);
        b.keyRelease(KeyEvent.VK_ENTER);

	}

}
