package PizzaHut;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pizzahut {

	public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("https://www.pizzahut.co.in/");
          driver.manage().window().maximize();
          driver.findElement(By.xpath("//div[text()='Find my current location']")).click();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   		  driver.findElement(By.xpath("(//div[@class='hut-option mr-10'])[1]")).click();
   		 // Actions a=new Actions(driver);
   		 // WebElement deal=driver.findElement(By.xpath("(//a[@href='/order/deals/'])[2]"));
   		  driver.findElement(By.xpath("(//a[@href='/order/desserts/'])[2]")).click();
   		  //a.dragAndDrop(deal, deserts).click().build().perform();
   		  driver.findElement(By.xpath("//div[text()='Cornetto Double Chocolate']")).click();
   		  driver.findElement(By.xpath("//button[@class='button button--green']")).click();
   		  driver.findElement(By.xpath("(//a[@href='/order/pizzas/'])[2]")).click();
   		  //a.dragAndDrop(deserts, pizza).click().build().perform();
   		  JavascriptExecutor js=(JavascriptExecutor) driver;
   		  WebElement size=driver.findElement(By.xpath("//select[@id='dropdown_56']"));
   		  js.executeScript("arguments[0].scrollIntoView(true)", size);
   		  Select sizedropdown=new Select(size);
   		  sizedropdown.selectByVisibleText("Medium San Francisco Style");
   		  driver.findElement(By.xpath("(//button[@class='button button--md button--green flex-1 font-semibold'])[12]")).click();
   		  driver.findElement(By.xpath("//span[text()='Checkout']")).click();
   		  driver.findElement(By.xpath("//input[@id='checkout__name']")).sendKeys("Gawtham");
   		  driver.findElement(By.xpath("//input[@id='checkout__phone']")).sendKeys("8909876543");
   		  driver.findElement(By.xpath("//input[@id='checkout__email']")).sendKeys("gawtham54@gmail.com");
   		  driver.findElement(By.xpath("//span[text()='Cash']")).click();
   		  //driver.findElement(By.xpath("//button[@id='submit-checkout']")).click();

         

	}

}
