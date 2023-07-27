package Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		WebElement fruit=driver.findElement(By.id("fruits"));
		Select fruitdd=new Select(fruit);
		fruitdd.selectByIndex(0);
		fruitdd.selectByIndex(1);
		fruitdd.selectByIndex(2);
		fruitdd.selectByIndex(3);
		System.out.println(fruitdd.isMultiple());
		System.out.println("Available All Fruits:");
		List<WebElement> list=fruitdd.getOptions();
		for(int i=0;i<fruitdd.getOptions().size();i++)
		{
			WebElement index=list.get(i);
			String s=index.getText();
			System.out.println(s);
		}
		System.out.println("First selected Fruit:");
		WebElement list1=fruitdd.getFirstSelectedOption();
		String s=list1.getText();
		System.out.println(s);
		

	}

}
