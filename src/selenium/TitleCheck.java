package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class TitleCheck {

	public static void main(String[] args) throws InterruptedException {
		// setting the drivers
		//System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		//casting driver
		//WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		//casting driver
		WebDriver driver=new ChromeDriver();
		//getting the window size
		driver.manage().window().maximize();
		//browser size
		Thread.sleep(2000);
		Dimension d=new Dimension(500,500); 
		driver.manage().window().setSize(d);				
		//browser minimize
		Thread.sleep(2000);
		Point p=new Point(500,500);
		driver.manage().window().setPosition(p);
		//opens the url
		driver.get("https://www.google.com");
		//storing webpage title
		String titleone=driver.getTitle();
		//printing the title
		System.out.println(titleone);
		driver.get("https://www.fb.com");
		String titletwo=driver.getTitle();
		System.out.println(titletwo);
		driver.get("https://www.yahoo.com");
		String titlethree=driver.getTitle();
		System.out.println(titlethree);
		driver.get("https://www.amazon.com");
		String titlefour=driver.getTitle();
		System.out.println(titlefour);
		driver.get("https://www.flipkart.com");
		String titlefive=driver.getTitle();
		System.out.println(titlefive);
		if(titleone.equals(titletwo))
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title is different");
		}
		
	}

}
