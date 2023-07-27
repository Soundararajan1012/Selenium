package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		String baseUrl="https://demo.guru99.com/test/link.html";
		driver.get(baseUrl);
		//driver.findElement(By.linkText("click here")).click();
		driver.findElement(By.partialLinkText("here")).click();
		System.out.println("title of page is:"+driver.getTitle());
		driver.navigate().back();
		//driver.findElement(By.partialLinkText("HE")).click();
		//System.out.println("title of page is:"+driver.getTitle());
		driver.quit();

	}

}
