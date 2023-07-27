package day6;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Actions a=new Actions(driver);
		WebElement flip2=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		a.click(flip2).perform();
		WebElement flip=driver.findElement(By.xpath("//a[text()='Login']"));
		a.click(flip).perform();
		WebElement flip1=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		flip1.sendKeys("rajan67@gmail.com");
		//keyboard based actions
		a.keyDown(Keys.CONTROL);
		a.sendKeys("A");//--->shortcut of selectall(ctrl+A)
		a.keyUp(Keys.CONTROL);
		a.build().perform();
		a.keyDown(Keys.CONTROL);
		a.sendKeys("X");//--->shortcut of cut(ctrl+x)
		a.keyUp(Keys.CONTROL);
		a.build().perform();
		a.keyDown(Keys.CONTROL);
		a.sendKeys("V");//--->shortcut of paste(ctrl+v)
		a.keyUp(Keys.CONTROL);
		a.build().perform();

	}

}
