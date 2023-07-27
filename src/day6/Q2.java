package day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/webhp");
		Actions a=new Actions(driver);
		WebElement enter=driver.findElement(By.xpath("//input[@name='q']"));
		enter.sendKeys("VelMurugan");
		a.doubleClick(enter).perform();
		//keyboard based actions
		a.keyDown(Keys.CONTROL);
		a.sendKeys("X");//--s->shortcut of cut(ctrl+x)
		a.keyUp(Keys.CONTROL);
		a.build().perform();
		
		

	}

}
