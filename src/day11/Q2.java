package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement table=driver.findElement(By.xpath("/html/body/center/table"));
		List<WebElement> list=table.findElements(By.tagName("tr"));
		WebElement row1=list.get(0);
		System.out.println(row1);
		List<WebElement> td1=row1.findElements(By.tagName("td"));
		
			WebElement data1=td1.get(0);
			WebElement data2=td1.get(1);
			String text1=data1.getText();
			String text2=data2.getText();
			System.out.println(text1);
			System.out.println(text2);
			

	}

}
