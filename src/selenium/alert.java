package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//simple alert
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
		Alert alerts=driver.switchTo().alert();
		System.out.println(alerts.getText());
		alerts.accept();
		//confirm alert
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Alert alerts1=driver.switchTo().alert();
		System.out.println(alerts1.getText());
		alerts1.accept();
		//prompt alert
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		Alert alerts2=driver.switchTo().alert();
		System.out.println(alerts2.getText());
		alerts2.sendKeys("raja");
		alerts2.accept();

	}

}
