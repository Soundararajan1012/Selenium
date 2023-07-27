package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
        Actions a=new Actions(driver);
        WebElement courses=driver.findElement(By.xpath("//div[text()='Courses ']"));
        a.moveToElement(courses).build().perform();
        WebElement oracle=driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
        a.moveToElement(oracle).build().perform();
        WebElement oraclesql=driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Certification Training']"));
        a.click(oraclesql).build().perform();

	}

}
