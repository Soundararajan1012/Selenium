package Day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select monthdd=new Select(month);
		List<WebElement> list=monthdd.getOptions();
		System.out.println("Month:");
		for(int i=0;i<monthdd.getOptions().size();i++)
		{
			WebElement index=list.get(i);
			String indexvalue=index.getText();
			System.out.println(indexvalue);
		}

	}

}
