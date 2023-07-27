package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement address=driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
		js.executeScript("arguments[0].scrollIntoView(true)", address);
        String s=address.getText();
        System.out.println("Address:"+s);
	}

}
