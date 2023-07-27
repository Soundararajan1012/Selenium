package day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones X");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Actions a=new Actions(driver);
		Robot b=new Robot();
		WebElement mobile=driver.findElement(By.xpath("//span[text()='Apple iPhone XS, US Version, 256GB, Space Gray - Unlocked (Renewed)']"));
		a.contextClick(mobile).build().perform();
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Set<String> s=driver.getWindowHandles(); 
		System.out.println(s);
		List<String> windowhandling=new ArrayList<String>(s);
		driver.switchTo().window(windowhandling.get(1));
		Thread.sleep(3000);
		WebElement text= driver.findElement(By.xpath("(//span[text()='$239.00'])[2]"));
        String d=text.getText();
        System.out.println("cost of price:"+d);
	}

}
