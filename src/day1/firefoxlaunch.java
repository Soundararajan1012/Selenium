package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxlaunch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to(" http://www.greenstechnologys.com/");
		Thread.sleep(2000);
		driver.navigate().to(" https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(2000);
		driver.navigate().to("http://greenstech.in/selenium-course-content.html");

	}

}
