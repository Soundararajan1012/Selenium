package Day7;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions a=new Actions(driver);
		WebElement flip= driver.findElement(By.xpath("//div[text()='Fashion']"));
		a.click(flip).perform();
		WebElement flip1= driver.findElement(By.xpath("//a[text()='All']"));
		a.click(flip1).perform();
		Thread.sleep(2000);
		WebElement flip2= driver.findElement(By.xpath("//span[text()='Women']"));
	    a.moveToElement(flip2).build().perform();
	    a.clickAndHold(flip2).perform();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		String timestamp=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\screenshot\\flipkart1.png"+timestamp+".png");
		FileUtils.copyFile(source, destination);

	}

}