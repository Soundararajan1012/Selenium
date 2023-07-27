package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://greenstech.in/selenium-course-content.html");
        WebElement address=driver.findElement(By.xpath("(//div[contains(@class,'col-md-3 short-desc-with-logo widget widget_text')])[1]"));
        System.out.println("Text contains:"+address.getText());
        driver.quit();
	}

}
