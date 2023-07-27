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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/ ");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		Actions a=new Actions(driver);
//		Robot b=new Robot();
		driver.findElement(By.name("keyword")).sendKeys("iphones 7 Mobile");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.findElement(By.xpath("(//div[@class='product-tuple-description '])[1]")).click();
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		List<String> windowhandling=new ArrayList<String>(s);
		driver.switchTo().window(windowhandling.get(1));
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		driver.findElement(By.xpath("//div[@class='you-pay']"));
		System.out.println(driver.findElement(By.xpath("//div[@class='you-pay']")).getText());

	}

}
