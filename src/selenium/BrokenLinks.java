package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> li1= driver.findElements(By.tagName("a"));
		for (WebElement li2 : li1) {
			String url=li2.getAttribute("href");
			if(url==null||url.isEmpty())
			{
				System.err.println("url is empty");
				continue;
			}
			if(!url.startsWith("https"))
			{
				System.err.println("Not start with https");
				continue;
			}
			URL path;
		
				path = new URL(url);
			
			try {
				HttpURLConnection huc=(HttpURLConnection)(path.openConnection());//-->Downcasting
				huc.connect();
				
				int result=huc.getResponseCode();
				if(result>=400)
				{
					System.err.println(url+"Broken Link");
				}
				else
				{
					System.out.println(url+"Its a valid link");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
				
		}

	}

}
