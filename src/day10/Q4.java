package day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue.WaitStrategy;


public class Q4 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3200)");
		Actions a=new Actions(driver);
		Robot b=new Robot();
		WebElement selenium= driver.findElement(By.xpath("//div[@id='Curricu-accordiannn1']"));
		a.click(selenium).build().perform();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,700)");
		WebElement selenium1=driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		a.click(selenium1).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
		Set<String> t=driver.getWindowHandles();
		System.out.println(t);
		List<String> windowhandling=new ArrayList<String>(t);
		driver.switchTo().window(windowhandling.get(1));
		WebElement result=driver.findElement(By.xpath("//pre[contains(text(),'QUESTION 1')]"));
		String s=result.getText();
		System.out.println(s);
////		a.moveToElement(click1).build().perform();
//		
//		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(day10)).click();
//		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
	}

}
