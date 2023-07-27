package day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.actiontags;
import selenium.alert;

public class Q4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebDriverWait time = new WebDriverWait(driver,Duration.ofSeconds(20));
		Actions a=new Actions(driver);
	    WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
        a.moveToElement(mobile).build().perform();
        driver.findElement(By.xpath("//strong[text()='Smartphones & Tablets']")).click();
        Set<String> s=driver.getWindowHandles();
        System.out.println(s);
        List<String> windowhandle=new ArrayList<String>(s);
        driver.switchTo().window(windowhandle.get(1));
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//span[text()='(Refurbished) Nokia 1600 Black 1.4 Inches(3.56 Cm) - Ex']")).click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
        //js.executeScript("document.getElementById('Above 5000').checked=true;");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       WebElement range=driver.findElement(By.xpath("//label[@for='Above 5000']"));
       a.click(range).build().perform();
       System.out.println("Price:"+driver.findElement(By.xpath("//label[@for='Above 5000']")).getText());
	}

}
