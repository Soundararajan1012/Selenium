package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Actions a=new Actions(driver);
        WebElement fashion=driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
        a.clickAndHold(fashion).build().perform();
        WebElement footwear=driver.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
        a.moveToElement(footwear).build().perform();
        WebElement heal=driver.findElement(By.xpath("//span[text()='Heels']"));
        a.click(heal).build().perform();

	}

}
