package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.name("q")).sendKeys("hp laptop");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
        Set<String> s=driver.getWindowHandles();
        System.out.println(s);
        List<String> t=new ArrayList<String>(s);
        driver.switchTo().window(t.get(1));
        driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
        System.out.println("Amount:"+driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText());

	}

}
