package Day9;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/automation-practice-form/");
        Actions a=new Actions(driver);
        
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        WebElement country=driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));  
       //Select countrydd=new Select(country);
        a.clickAndHold(country).build().perform();
        
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       WebElement state= driver.findElement(By.xpath("//div[text()='NCR']"));
       a.moveToElement(state).click().build().perform();
       System.out.println("Even State1:"+driver.findElement(By.xpath("//div[text()='NCR']")).getText());
       WebElement city=driver.findElement(By.xpath("//div[@id='city']"));
       a.clickAndHold(city).build().perform();
       WebElement state3= driver.findElement(By.xpath("//div[text()='Delhi']"));
       a.moveToElement(state3).click().build().perform();
      // WebElement state4= driver.findElement(By.xpath("//div[text()='Noida']"));
       //a.moveToElement(state4).click().build().perform();
       
       System.out.println("City1:"+driver.findElement(By.xpath("//div[text()='Delhi']")).getText());
       //System.out.println("City2:"+driver.findElement(By.xpath("//div[text()='Noida']")).getText());
       driver.findElement(By.xpath("//div[@id='city']")).click();
       //a.clickAndHold(city).build().perform();
       WebElement state4= driver.findElement(By.xpath("//div[text()='Noida']"));
       a.moveToElement(state4).click().build().perform();
       System.out.println("City1:"+driver.findElement(By.xpath("//div[text()='Noida']")).getText());
//       driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//       WebElement state2= driver.findElement(By.xpath("//div[@id='state']"));
//       a.clickAndHold(state2).click().build().perform();
//       a.moveToElement(state2).build().perform();
//       WebElement city1= driver.findElement(By.xpath("//div[@id='state']"));
//       a.clickAndHold(city1).click().build().perform();
//       a.moveToElement(city1).build().perform();
       driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]")).click();
       WebElement state1= driver.findElement(By.xpath("//div[text()='Haryana']"));
       a.moveToElement(state1).click().build().perform();
       System.out.println("State2:"+driver.findElement(By.xpath("//div[text()='Haryana']")).getText());
       driver.findElement(By.xpath("//div[@id='city']")).click();
       WebElement state6= driver.findElement(By.xpath("//div[text()='Karnal']"));
       a.moveToElement(state6).click().build().perform();
       driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       System.out.println("City:"+driver.findElement(By.xpath("//div[text()='Karnal']")).getText());
       

	}

}
