package Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		WebElement fruit=driver.findElement(By.id("fruits"));
		Select fruitdd=new Select(fruit);
		System.out.println(fruitdd.isMultiple());
		System.out.println("Available Fruits:");
		
		List<WebElement> e=fruitdd.getOptions();
		for(WebElement i:e)
		{
			System.out.println(i.getText());
		}
		if(fruitdd.isMultiple())
		{
			fruitdd.selectByIndex(1);
			fruitdd.selectByIndex(3);
			System.out.println("Selected Fruits");
			List<WebElement> list=fruitdd.getOptions();
			for(int i=0;i<fruitdd.getOptions().size();i++)
			{
				if(i%2!=0)
				{
				WebElement index=list.get(i);
				String indexvalue=index.getText();
				System.out.println(indexvalue);
				}
			}
			System.out.println("Not Selected Fruits");
			List<WebElement> list1=fruitdd.getOptions();
			for(int i=0;i<fruitdd.getOptions().size();i++)
			{
				if(i%2==0)
				{
				WebElement index=list1.get(i);
				String indexvalue=index.getText();
				System.out.println(indexvalue);
				}
			}
			
			
			
		}
		
		

	}

}
