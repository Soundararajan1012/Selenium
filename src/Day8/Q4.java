package Day8;

import java.awt.Frame;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		WebElement frame1= driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
        Alert alert1=driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();
	}

}
