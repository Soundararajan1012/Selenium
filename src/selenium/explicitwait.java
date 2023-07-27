package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class explicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//No such element-->implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement createAccount=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createAccount.click();
		WebElement firstname=driver.findElement(By.name("firstname"));
		//firstname.sendKeys("rajan");
		//driver.findElement(By.name("lastname")).sendKeys("M");
		//Element not visible exception
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(firstname)).sendKeys("rajan");

	}

}
