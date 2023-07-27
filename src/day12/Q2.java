package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement share=driver.findElement(By.xpath("//a[@class='youtube__link--go']"));
        js.executeScript("arguments[0].scrollIntoView(true)", share);
        Thread.sleep(3000);
        WebElement up=driver.findElement(By.xpath("//a[@href='/articles']"));
        js.executeScript("arguments[0].scrollIntoView(false)", up);
	}

}
