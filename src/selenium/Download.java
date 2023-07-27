package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/file");
		driver.manage().window().maximize();
		WebElement download=driver.findElement(By.xpath("//a[text()='Download Excel']"));
		download.click();
		WebElement download1=driver.findElement(By.xpath("//a[text()='Download Pdf']"));
		download1.click();
		WebElement download2=driver.findElement(By.xpath("//a[text()='Download Text']"));
		download2.click();
		File file1=new File("C:\\Users\\ADMIN\\Downloads");
		Thread.sleep(1000);
		File[] file2=file1.listFiles();
		
		for (File file3 : file2) {
			if(file3.getName().equalsIgnoreCase("sample.xlsx"))
			{
				System.out.println("Excel File is downloaded");
			}
	
			if(file3.getName().equals("sample.pdf"))
			{
				System.out.println("Pdf File is downloaded");
			}
		
			if(file3.getName().equals("sample.txt"))
			{
				System.out.println("Text File is downloaded");
			}
		}
			
		}

	}


