package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Actions a=new Actions(driver);
        WebElement dept=driver.findElement(By.xpath("//a[text()='All Departments']"));
        a.clickAndHold(dept).build().perform();
        WebElement heat=driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
        a.moveToElement(heat).build().perform();
        WebElement air=driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
        a.moveToElement(air).perform();
        WebElement portable=driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
        a.click(portable).build().perform();

	}

}
