package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1600)");
		WebElement selenium=driver.findElement(By.id("heading304"));
		selenium.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/TESTNG.txt']")).click();
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		List<String> t=new ArrayList<String>(s);
        driver.switchTo().window(t.get(1));
		driver.findElement(By.xpath("//pre[contains(text(),'QUESTION 12')]"));
		System.out.println(driver.findElement(By.xpath("//pre[contains(text(),'QUESTION 12')]")).getText());

	}

}
