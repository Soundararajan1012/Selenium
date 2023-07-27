package day2;

import java.awt.Robot;
import java.awt.event.KeyEvent;

//import java.awt.Robot;
//import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div#signin-block")).click();
		driver.findElement(By.cssSelector("div#signin-block")).click();
		
		 Thread.sleep(5000);
		 //driver.findElement(By.cssSelector("input#src")).sendKeys("Koyambedu, Chennai");
		 
		driver.findElement(By.cssSelector("input#src")).sendKeys("Chennai");
		Robot from=new Robot();
		from.keyPress(KeyEvent.VK_DOWN);
		from.keyRelease(KeyEvent.VK_ENTER);
		
		  Thread.sleep(2000); 
		  //driver.findElement(By.cssSelector("input#dest")).
		  //sendKeys("Vannarpettai, Tirunelveli");
		 
		driver.findElement(By.cssSelector("input#dest")).sendKeys("Tirunelveli");
		Robot to=new Robot();
		to.keyPress(KeyEvent.VK_DOWN);
		to.keyRelease(KeyEvent.VK_ENTER);
		
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[text()='Date']")).click();
		 driver.findElement(By.cssSelector("td.next")).click();
		 driver.findElement(By.xpath("//td[@class='wd day'][5]")).click();
		  driver.findElement(By.cssSelector("button#search_btn")).click();
		 		
		//iframe[@class='D121_iframe']

	}

}
