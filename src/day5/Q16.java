package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Actions a=new Actions(driver);
        WebElement sign1=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
        a.clickAndHold(sign1).build().perform();
        WebElement signin=driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
        a.click(signin).build().perform();
        WebElement number=driver.findElement(By.id("ap_email"));
        number.sendKeys("9098890989");
        WebElement continue1=driver.findElement(By.id("continue"));
        a.click(continue1).build().perform();
        WebElement password=driver.findElement(By.id("ap_password"));
        password.sendKeys("vishnu890");
        WebElement signin1=driver.findElement(By.id("signInSubmit"));
        a.click(signin1).build().perform();
        
	}

}
