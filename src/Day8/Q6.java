package Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='btn btn-default'])[1]")).click();
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
	}

}
