package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement table1=driver.findElement(By.xpath("/html/body/center/table"));
		List<WebElement> table=table1.findElements(By.tagName("tr"));
		System.out.println("Table Row:");
		for(int i=0;i<table.size();i++)
		{
			WebElement row=table.get(i);
			String s=row.getText();
			System.out.println(s);
		}
		List<WebElement> data=table1.findElements(By.tagName("td"));
		System.out.println("Tale data:");
		for(int j=0;j<table.size();j++)
		{
			WebElement data1=table.get(j);
			String t=data1.getText();
			System.out.println(t);
			System.out.println(" ");
		}
		    List<WebElement> rowsNumber = table1.findElements(By.tagName("tr"));
				int rowCount = rowsNumber.size();
				System.out.println("No of rows in this table : " + rowCount);
				//Finding number of Columns
				List<WebElement> columnsNumber = table1.findElements(By.tagName("td"));

				int columnCount = columnsNumber.size();
				System.out.println("No of columns in this table : " + columnCount);
		

	}

}
