package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// tr->table row, th->table head, td->table data or table column
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//to get the table id using xpath
		WebElement main=driver.findElement(By.id("customers"));
		//to get the row elements using tagname
		List<WebElement> tr=main.findElements(By.tagName("tr"));
		System.out.println("Availables:");
		//iterating each rows
		for(int i=0;i<tr.size();i++)
		{
			WebElement row=tr.get(i);
			String s=row.getText();
			System.out.println(s);
		}
		//to get heading in the table
		List<WebElement> th=main.findElements(By.tagName("th"));
		System.out.println("Table Heads:");
		for(int j=0;j<th.size();j++)
		{
			WebElement head=th.get(j);
			String text=head.getText();
			System.out.println(text);
			System.out.println(" ");
		}
		//to get data in that table
		List<WebElement> td=main.findElements(By.tagName("td"));
		System.out.println("Table Datas:");
		for(int k=0;k<td.size();k++) 
		{
			
		   WebElement data=td.get(k);
		   String text1=data.getText();
		   System.out.println(text1);
		   System.out.println(" ");
		}
		//to print first row of the table
		List<WebElement> tr1=main.findElements(By.tagName("tr"));
		//to get 4th row of the table
		WebElement row1=tr.get(3);
		System.out.println(row1);
		//to get data in that table
		List<WebElement> td1=row1.findElements(By.tagName("td"));
		
			WebElement data1=td1.get(0);
			WebElement data2=td1.get(1);
			WebElement data3=td1.get(2);
			String text1=data1.getText();
			String text2=data2.getText();
			String text3=data3.getText();
			System.out.println(text1 +text2 +text3);
			System.out.println(" ");
			
		

	}

}
