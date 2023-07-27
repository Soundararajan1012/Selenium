package Day7;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://toolsqa.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		TakesScreenshot ts=(TakesScreenshot) driver;
		String timestamp=new SimpleDateFormat("yy-MM-dd hh-mm-ss").format(new Date());
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\screenshot\\RecentArticle.png"+timestamp+".png");
		FileUtils.copyFile(source, destination); 

	}

}
