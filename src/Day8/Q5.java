package Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.findElement(By.xpath("//a[text()='https://online.canarabank.in ']")).click();
		driver.findElement(By.xpath("//span[text()='LOGIN']")).click();

	}

}
