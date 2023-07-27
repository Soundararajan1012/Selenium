package Day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
		Select datedd=new Select(date);
		List<WebElement> list=datedd.getOptions();
		for(int i=0;i<list.size();i++)
		{
			if(i%2!=0)
			{
				System.out.println("Date:"+list.get(i).getText());
			}
		}

	}

}
