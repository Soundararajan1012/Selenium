package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q15 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Actions a=new Actions(driver);
        WebElement sign1=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
        a.clickAndHold(sign1).build().perform();
        WebElement signin=driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
        a.click(signin).build().perform();
        WebElement create=driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
        a.click(create).build().perform();
        driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("venkat");
        driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9090989887");
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("venkat123");
        WebElement continue1=driver.findElement(By.xpath("//input[@id='continue']"));
        a.click(continue1).perform();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement frame1= driver.findElement(By.cssSelector("iframe#cvf-aamation-challenge-iframe"));
		driver.switchTo().frame(frame1);
        WebElement frame2= driver.findElement(By.cssSelector("iframe#aacb-arkose-frame"));
		driver.switchTo().frame(frame2);
		WebElement frame3= driver.findElement(By.cssSelector("iframe.r34K7X1zGgAi6DllVF3T.show.active.inline"));
		driver.switchTo().frame(frame3);
		WebElement frame4= driver.findElement(By.cssSelector("iframe#fc-iframe-wrap"));
		driver.switchTo().frame(frame4);
		WebElement frame5= driver.findElement(By.cssSelector("iframe#CaptchaFrame"));
		driver.switchTo().frame(frame5);
		Thread.sleep(3000);
        WebElement solve=driver.findElement(By.cssSelector("button#home_children_button"));
        a.click(solve).perform();
        

	}

}
