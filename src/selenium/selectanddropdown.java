package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectanddropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement createbtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createbtn.click();
		WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
		Select dateDropDown=new Select(date);
		dateDropDown.selectByValue("23");
		WebElement yearDD=driver.findElement(By.xpath("//select[@id='year']"));
		Select yearDropDown=new Select(yearDD);
		yearDropDown.selectByVisibleText("2022");
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select monthDropDown=new Select(month);
		monthDropDown.selectByIndex(1);

	}

}
