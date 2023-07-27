package day10;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("headerSearch")).sendKeys("celling fan");
		driver.findElement(By.id("headerSearchButton")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		
		Thread.sleep(2000);
		//WebElement click= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/div[1]/div/div[12]/div/div[2]/div/div[1]/div"));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOf(click)).click();
		
		driver.findElement(By.xpath("(//span[@class='product-header__title-product--4y7oa'])[1]")).click();
		//driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]")).click();
		driver.findElement(By.xpath("//button[@id='deliveryZipDropDownClose']")).click();
		driver.findElement(By.xpath("//h3[text()='Specifications']")).click();
		driver.findElement(By.xpath("//span[text()='Remote Included']")).click();
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		List<String> windowhandling=new ArrayList<String>(s);
		driver.switchTo().window(windowhandling.get(1));
		driver.findElement(By.xpath("//div[@class='product-header__title--clamp--4y7oa product-header__title--fourline--4y7oa']")).click();

	}

}
