package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartriptrain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/trains");
		//register
		//driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("from_station")).sendKeys("Chennai Egmore");
		driver.findElement(By.id("to_station")).sendKeys("Tirunelveli Junction");
		//driver.findElement(By.id("trainClass")).click();
		WebElement coach=driver.findElement(By.id("trainClass"));
		Select coachdd=new Select(coach);
		coachdd.selectByValue("SL");
		driver.findElement(By.id("dpt_date")).click();
		driver.findElement(By.xpath("//a[text()='22']")).click();
		WebElement adults=driver.findElement(By.id("train_adults"));
		Select adultsdd=new Select(adults);
		adultsdd.selectByValue("1");
		WebElement children=driver.findElement(By.id("train_children"));
		Select childrendd=new Select(children);
		childrendd.selectByValue("2");
		WebElement seniormen=driver.findElement(By.id("train_male_seniors"));
		Select seniormendd=new Select(seniormen);
		seniormendd.selectByValue("2");
		WebElement seniorwomen=driver.findElement(By.id("train_female_seniors"));
		Select seniorwomendd=new Select(seniorwomen);
		seniorwomendd.selectByValue("2");
		driver.findElement(By.id("trainFormButton")).click();
		//signin clearup
		Thread.sleep(2000);		
		WebElement signin=driver.findElement(By.cssSelector("iframe.spinnerMedium"));
		driver.switchTo().frame(signin);
		driver.findElement(By.id("email")).sendKeys("suresh321@gmail.com");
		driver.findElement(By.id("password")).sendKeys("suresh321@");
		driver.findElement(By.xpath("//label[text()='Remember me on this computer']")).click();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	}

}
