package Homechoices;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class under1000 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homechoice.co.za/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions a=new Actions(driver);
		WebElement under=driver.findElement(By.xpath("//a[text()='Under 1000']"));
		a.moveToElement(under).click(under).build().perform();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement baby=driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		js.executeScript("arguments[0].scrollIntoView(true)",baby);
		a.click(baby).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='refinement-brand-0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='R 300.00 - R 399.99']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='refinement-hc_size-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='refinement-hc_colour-1']")).click();
		Thread.sleep(2000);
		WebElement baby1= driver.findElement(By.xpath("//h3[text()='COCO&CO Lulu Muslin Baby Blanket']"));
		js.executeScript("arguments[0].scrollIntoView(true)", baby1);
		a.click(baby1).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[text()='Pink']")).click();
		driver.findElement(By.xpath("(//span[text()='R349'])[2]")).click();
		driver.findElement(By.id("cc-prodDetailsAddToCart")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='Basket']")).click();
		Thread.sleep(3000);
		WebElement cart= driver.findElement(By.xpath("//a[@class='cc-button-primary btn-checkout col-xs-12']"));
		cart.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Log in or Register']")).click();
		driver.findElement(By.id("registerLink")).click();
		WebElement title=driver.findElement(By.id("user.attributes.TitleDesc"));
		Select titledd=new Select(title);
		titledd.selectByIndex(0);
		driver.findElement(By.id("firstName")).sendKeys("Ahammed");
		driver.findElement(By.id("lastName")).sendKeys("siraji");
		driver.findElement(By.xpath("//label[@for='user.attributes.idType3']")).click();
		driver.findElement(By.id("user.attributes.idNumber")).sendKeys("17903392321");
		driver.findElement(By.id("user.attributes.UserBirthdate")).sendKeys("30/05/1964");
		driver.findElement(By.id("user.attributes.mobile")).sendKeys("8495365476");
		driver.findElement(By.id("email")).sendKeys("ahammedfazil817@gmail.com");
		driver.findElement(By.id("password")).sendKeys("098415");
		driver.findElement(By.id("registerBtn")).click();
		Thread.sleep(5000);
		WebElement delivery= driver.findElement(By.id("CC-checkoutAddressBook-scountry"));
		Select deliverydd=new Select(delivery);
		deliverydd.selectByIndex(4);
		Thread.sleep(2000);
		WebElement region= driver.findElement(By.id("CC-checkoutAddressBook-sstate"));
		Select regiondd=new Select(region);
		regiondd.selectByIndex(3);
		driver.findElement(By.id("CC-checkoutAddressBook-saddress1")).sendKeys("232");
		driver.findElement(By.id("CC-checkoutAddressBook-saddress2")).sendKeys("Johannes Ramokhoase Street");
		//Robot c=new Robot();
		Thread.sleep(2000);
		Actions v=new Actions(driver);
		driver.findElement(By.id("CC-checkoutAddressBook-scity")).sendKeys("Cape Town");
		WebElement city= driver.findElement(By.xpath("//li[text()=', Cape Town, 8000']"));
		v.moveToElement(city).click(city).build().perform();
		//driver.findElement(By.id("CC-checkoutAddressBook-szipcode")).sendKeys("8000");
		driver.findElement(By.xpath("//label[@for='eft_ozow']")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	}

}
