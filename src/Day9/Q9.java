package Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		//login
		driver.findElement(By.id("username")).sendKeys("muppidathi");
		driver.findElement(By.id("password")).sendKeys("muppidathi123@");
		driver.findElement(By.id("login")).click();
		//Room type available
		WebElement room=driver.findElement(By.id("room_type"));
		Select roomdd=new Select(room);
		List<WebElement> list=roomdd.getOptions();
		System.out.println("Room Types:");
		for(int i=1;i<roomdd.getOptions().size();i++)
		{
			WebElement index=list.get(i);
			String indexvalue=index.getText();
			System.out.println(indexvalue);
		}

	}

}
