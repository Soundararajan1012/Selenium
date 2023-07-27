package Day7;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		TakesScreenshot ts=(TakesScreenshot) driver;
		String timestamp=new SimpleDateFormat("yy-MM-dd hh-mm-ss").format(new Date());
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\screenshot\\greens1.png"+timestamp+".png");
		FileUtils.copyFile(source, destination);
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-800)");

	}

}
