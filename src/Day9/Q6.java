package Day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement country=  driver.findElement(By.xpath("//select[@name='country']"));
		Select countrydd=new Select(country);
		List<WebElement> list=countrydd.getOptions();
		for(int i=0;i<countrydd.getOptions().size();i++)
		{
			WebElement index=list.get(i);
			String index1=index.getText();
			System.out.println("Country:"+index1);
		}

	}

}
