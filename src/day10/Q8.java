package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.name("keyword")).sendKeys("Hand sanitizer");
        driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
        driver.findElement(By.xpath("(//a[@class='dp-widget-link noUdLine hashAdded'])[1]")).click();
        Set<String> s=driver.getWindowHandles();
        System.out.println(s);
        List<String> t=new ArrayList<String>(s);
        driver.switchTo().window(t.get(1));
        driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	}

}
