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
import org.openqa.selenium.interactions.Actions;

public class Q7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		driver.findElement(By.xpath("//h2[@class='mb-0']/parent::div[@id='heading302']")).click();
		Actions a=new Actions(driver);
		WebElement work=driver.findElement(By.xpath("(//li[@class='pointer'])[67]"));
		a.moveToElement(work).click(work).build().perform();
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		List<String> t=new ArrayList<String>(s);
        driver.switchTo().window(t.get(1));
        driver.findElement(By.xpath("//pre[contains(text(),'QUESTION 1')]"));
        System.out.println(driver.findElement(By.xpath("//pre[contains(text(),'QUESTION 1')]")).getText());

	}

}
