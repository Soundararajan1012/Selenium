package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlesredbus extends Reusable2  {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.id("sign-in-icon-down")).click();
		driver.findElement(By.id("signInLink")).click();
		WebElement iframe1=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(iframe1);
		driver.findElement(By.xpath("//div[@class='mobileInput clearfix']/child::input[@class='IP']")).sendKeys("9809987890");
		driver.switchTo().parentFrame();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement iframe2=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div[3]/iframe"));
		driver.switchTo().frame(iframe2);
		WebElement frame3=driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
		driver.switchTo().frame(frame3);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb ']/child::span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();
//		Set<String> window=driver.getWindowHandles();
//		System.out.println(window);
//		List<String> windowhandling=new ArrayList<String>(window);
//		driver.switchTo().window(windowhandling.get(0));
		//windowhandles();
		String window=driver.getWindowHandle();
		System.out.println(window);
		Set<String>first=driver.getWindowHandles();
		List<String> windowhandling=new ArrayList<String>(first);
		for(String f:windowhandling) {
			System.out.println(f);
			if(!f.equals(window)) {
				driver.switchTo().window(f);
			}
		}
		System.out.println(driver.getTitle());

	} 

}
