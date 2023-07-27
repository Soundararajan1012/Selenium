package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IElaunch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("http://www.greenstechnologys.com/");
		Thread.sleep(2000);
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.navigate().to("http://www.greenstechnologys.com/");
		Thread.sleep(2000);
		driver.navigate().to("http://greenstech.in/selenium-course-content.html");

	}

}
