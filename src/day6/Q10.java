package day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q10 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		Actions a=new Actions(driver);
		Robot b=new Robot();
		WebElement snap=driver.findElement(By.xpath("(//div[text()='Bhawna Collection Loard Shiv Trishul Damru Locket With Puchmukhi Rudraksha Mala Gold-plated Brass, Wood For Men & Women'])[1]"));
		a.contextClick(snap).perform();
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
