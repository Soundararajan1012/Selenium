package selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot1{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		driver.manage().window().maximize();
		WebElement sign=driver.findElement(By.xpath("//a[text()='Sign In']"));
		sign.click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		String timestamp=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\screenshot\\error.png"+timestamp+".png");
		FileUtils.copyFile(source,destination);
		

	}

}
