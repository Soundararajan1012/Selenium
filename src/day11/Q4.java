package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement table=driver.findElement(By.xpath("/html/body/center/table"));
		List<WebElement> tr=table.findElements(By.tagName("tr"));
		WebElement row=tr.get(1);
		System.out.println(row);
		List<WebElement> td=row.findElements(By.tagName("td"));
		WebElement col=td.get(1);
		String s=col.getText();
		System.out.println("4th Available webtable:"+s);
	}

}
