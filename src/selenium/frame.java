package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(element);
		WebElement pass=driver.findElement(By.xpath("//input[@type='text']"));
		pass.sendKeys("HELLO");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href='WebTable.html']")).click();

	}

}
