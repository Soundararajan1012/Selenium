package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiontags {

	public static void main(String[] args) {
		// setting up the driver
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
//		//maximize the window
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		//WebElement From=driver.findElement(By.xpath("//a[text()=' BANK ']"));
//		//(//li[@class='placeholder'])[1]
		//WebElement To=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		//a.dragAndDrop(From,To).build().perform();
		driver.get("https://www.amazon.in/");
		WebElement w=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		//WebElement q=driver.findElement(By.xpath("(//a[text()='Mobile'])[1]"));
		//a.doubleClick(w).build().perform();
		//a.click(w).build().perform();
         a.contextClick(w).build().perform();
		//a.clickAndHold(w).build().perform();
		//a.moveToElement(w).build().perform();
	}

}
