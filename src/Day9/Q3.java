package Day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select yeardd=new Select(year);
		List<WebElement> list=yeardd.getOptions();
		System.out.println("Years:");
		for(int i=0;i<yeardd.getOptions().size();i++)
		{
			WebElement index=list.get(i);
			String indexvalue=index.getAttribute("value");
			System.out.println(indexvalue);
		}

	}

}
