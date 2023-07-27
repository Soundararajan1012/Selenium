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
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("8754372815");
		TakesScreenshot fb=(TakesScreenshot) driver;
		File src1=fb.getScreenshotAs(OutputType.FILE);
		String ss1=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		File des1=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\screenshot\\facebook"+ss1+".png");
		FileUtils.copyFile(src1, des1);
		driver.findElement(By.id("pass")).sendKeys("10121998");
		TakesScreenshot fb1=(TakesScreenshot) driver;
		File src2=fb1.getScreenshotAs(OutputType.FILE);
		String ss2=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		File des2=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\screenshot\\facebook"+ss2+".png");
		FileUtils.copyFile(src2, des2);
		driver.findElement(By.name("login")).click();
		TakesScreenshot fb2=(TakesScreenshot) driver;
		File src3=fb2.getScreenshotAs(OutputType.FILE);
		String ss3=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		File des3=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\screenshot\\facebook"+ss3+".png");
		FileUtils.copyFile(src3, des3);
	}

}
