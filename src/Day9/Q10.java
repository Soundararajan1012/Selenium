package Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		//login
		driver.findElement(By.id("username")).sendKeys("muppidathi");
		driver.findElement(By.id("password")).sendKeys("muppidathi123@");
		driver.findElement(By.id("login")).click();
		//Location
		WebElement location=driver.findElement(By.id("location"));
		Select locationdd=new Select(location);
		List<WebElement> list=locationdd.getOptions();
		System.out.println("Locations:");
		for(int i=1;i<locationdd.getOptions().size();i++)
		{
			WebElement index=list.get(i);
			String indexvalue=index.getText();
			System.out.println(indexvalue);
		}

	}

}
