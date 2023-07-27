package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sortable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/sortable");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		WebElement from=driver.findElement(By.xpath("//div[text()=' Get to work']"));
		WebElement to=driver.findElement(By.xpath("//div[text()=' Walk dog']"));
		actions.click(from).clickAndHold().moveToElement(to).moveByOffset(20, 0).release().build().perform();
		Thread.sleep(4000);
		Actions actions1=new Actions(driver);
		WebElement from1=driver.findElement(By.xpath("//div[text()=' Pick up groceries']"));
		WebElement to1=driver.findElement(By.xpath("//div[text()=' Get to work']"));
		actions1.click(from1).clickAndHold().moveToElement(to1).moveByOffset(16, 0).release().build().perform();
		Thread.sleep(4000);
		Actions actions2=new Actions(driver);
		WebElement from2=driver.findElement(By.xpath("//div[text()=' Go home']"));
		WebElement to2=driver.findElement(By.xpath("//div[text()=' Pick up groceries']"));
		actions2.click(from2).clickAndHold().moveToElement(to2).moveByOffset(17, 0).release().build().perform();
		Thread.sleep(4000);
		Actions actions3=new Actions(driver);
		WebElement from3=driver.findElement(By.xpath("//div[text()=' Fall asleep']"));
		WebElement to3=driver.findElement(By.xpath("//div[text()=' Go home']"));
		actions3.click(from3).clickAndHold().moveToElement(to3).moveByOffset(18, 0).release().build().perform();
		//actions.click(from).clickAndHold().moveToElement(to).dragAndDropBy(to, 0, 10).build().perform();//-->come down to walk dog
//		Actions actions4=new Actions(driver);
//		WebElement from4=driver.findElement(By.xpath("//div[text()=' Walk dog']"));
//		WebElement to4=driver.findElement(By.xpath("//div[text()=' Get to work']"));
//		actions4.click(from4).clickAndHold().moveToElement(to4).moveByOffset(10, 0).release().build().perform();
		
		
		
	
	}
	

}
