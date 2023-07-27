package day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automationtesting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		driver.findElement(By.cssSelector("input[ng-model=FirstName]")).sendKeys("sundar");
		driver.findElement(By.cssSelector("input[ng-model=LastName]")).sendKeys("rajan");
		driver.findElement(By.cssSelector("textarea[ng-model=Adress]")).sendKeys("No6,north street,vellore");
		driver.findElement(By.cssSelector("input[ng-model=EmailAdress]")).sendKeys("rajan@gmail.com");
		driver.findElement(By.cssSelector("input[ng-model=Phone]")).sendKeys("8769054321");
		driver.findElement(By.cssSelector("input[value=Male]")).click();
		driver.findElement(By.cssSelector("input#checkbox1")).click();
		driver.findElement(By.cssSelector("input#checkbox2")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("div#msdd")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		driver.findElement(By.xpath("//a[text()='Malay']")).click();
		WebElement skill= driver.findElement(By.cssSelector("select#Skills"));
		Select skilldd=new Select(skill);
		skilldd.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.id("countries")).click();
		driver.findElement(By.cssSelector("span.select2-selection.select2-selection--single")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		WebElement year=driver.findElement(By.cssSelector("select#yearbox"));
		Select yeardd=new Select(year);
		yeardd.selectByValue("1998");
		WebElement month=driver.findElement(By.cssSelector("select[ng-model=monthbox]"));
		Select monthdd=new Select(month);
		monthdd.selectByVisibleText("February");
		WebElement day=driver.findElement(By.cssSelector("select#daybox"));
		Select daydd=new Select(day);
		daydd.selectByIndex(5);
		driver.findElement(By.cssSelector("input#firstpassword")).sendKeys("raja123");
		driver.findElement(By.cssSelector("input#secondpassword")).sendKeys("raja123");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button#submitbtn")).click();
		//driver.findElement(By.cssSelector("button#Button1")).click();
		
	}

}
