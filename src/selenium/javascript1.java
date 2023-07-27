package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");//vertical
		//js.executeScript("window.scrollBy(0,-1000)");
		//driver.navigate().to("https://www.album.alexflueras.ro/");
		//horizontal
		//js.executeScript("window.scrollBy(1000,0)");
		//WebElement mobile=driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
		//js.executeScript("arguments[0].click()", mobile);
		WebElement mobiles=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		js.executeScript("arguments[0].click()", mobiles);

	}

}
