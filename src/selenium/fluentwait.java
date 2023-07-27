package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(45))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		WebElement month=wait.until(new Function<WebDriver,WebElement>() {
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.xpath("//select[@title='Month']"));
			}
		});
		month.click();
		Select dropdown=new Select(month);
		dropdown.selectByIndex(2);
		/* types of wait /Synchronise
		 * implicit wait - WebDriver Wait(For all conditions)
		 * Explicit wait - (wait for particular conditions)
		 * Fluent wait - (wait for particular conditions)
		 * Thread.sleep()-->Java(Forceful wait)
		 */
		 

	}

}
