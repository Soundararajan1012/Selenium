package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.shopclues.com/wholesale.html");
       Actions a=new Actions(driver);
       WebElement sports=driver.findElement(By.xpath("//a[text()='Sports & More']"));
       a.moveToElement(sports).build().perform();
       Thread.sleep(3000);
       WebElement weightgainer=driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
       a.click(weightgainer).build().perform();
	}

}
