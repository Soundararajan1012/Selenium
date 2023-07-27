package Day9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/automation-practice-form/");
        Actions a=new Actions(driver);
        Robot b=new Robot();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        WebElement country=driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));  
       //Select countrydd=new Select(country);
        a.clickAndHold(country).build().perform();
        
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       WebElement state= driver.findElement(By.xpath("//div[text()='Uttar Pradesh']"));
       a.moveToElement(state).click().build().perform();
       System.out.println("Even State1:"+driver.findElement(By.xpath("//div[text()='Uttar Pradesh']")).getText());
       WebElement city=driver.findElement(By.xpath("//div[@id='city']"));
       a.clickAndHold(city).build().perform();
       WebElement state3= driver.findElement(By.xpath("//div[text()='Lucknow']"));
       a.moveToElement(state3).click().build().perform();
       System.out.println("City:"+driver.findElement(By.xpath("//div[text()='Lucknow']")).getText());
       
       driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]")).click();
       //WebElement state2= driver.findElement(By.xpath("//div[@id='state']"));
//       a.clickAndHold(state2).click().build().perform();
//       a.moveToElement(state2).build().perform();
//       WebElement city1= driver.findElement(By.xpath("//div[@id='state']"));
//       a.clickAndHold(city1).click().build().perform();
//       a.moveToElement(city1).build().perform();
       
       WebElement state1= driver.findElement(By.xpath("//div[text()='Rajasthan']"));
       a.moveToElement(state1).click().build().perform();
       System.out.println("State2:"+driver.findElement(By.xpath("//div[text()='Rajasthan']")).getText());
       driver.findElement(By.xpath("//div[@id='city']")).click();
       WebElement state6= driver.findElement(By.xpath("//div[text()='Jaiselmer']"));
       a.moveToElement(state6).click().build().perform();
       System.out.println("City:"+driver.findElement(By.xpath("//div[text()='Jaiselmer']")).getText());
//       driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]")).click();
//        b.keyPress(KeyEvent.VK_DOWN);
//        b.keyRelease(KeyEvent.VK_DOWN);
//        b.keyPress(KeyEvent.VK_DOWN);
//        b.keyRelease(KeyEvent.VK_DOWN);
//        b.keyPress(KeyEvent.VK_ENTER);
//        b.keyRelease(KeyEvent.VK_ENTER);
//       
       
	}

}
