package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Actions a=new Actions(driver);
        WebElement courses=driver.findElement(By.xpath("//div[text()='Courses ']"));
        a.clickAndHold(courses).build().perform();
        WebElement ware=driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
        a.clickAndHold(ware).perform();

	}

}
