package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/calendar");
		driver.manage().window().maximize();
		WebElement from=driver.findElement(By.xpath("//input[@class='datetimepicker-dummy-input is-datetimepicker-range']"));
		from.click();
		WebElement from1=driver.findElement(By.xpath("(//button[@class='date-item is-today'])[2]"));
		from1.click();
		WebElement to=driver.findElement(By.xpath("(//button[text()='21'])[2]"));
		to.click();
		WebElement time=driver.findElement(By.xpath("(//span[@class='timepicker-next'])[1]"));
		time.click();
		time.click();
		WebElement validate=driver.findElement(By.xpath("(//button[text()='Validate '])[1]"));
		validate.click();

	}

}
