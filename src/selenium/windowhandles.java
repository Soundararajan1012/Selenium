package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://letcode.in/windows");
		String window=driver.getWindowHandle();
		System.out.println("First window:"+window);
		driver.findElement(By.id("home")).click();
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		List<String> list=new ArrayList<String>(s);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list.get(0));
		driver.close();
//		String c=driver.getCurrentUrl();
//		System.out.println(c);
		Set<String> windows=driver.getWindowHandles();
		List<String> lists=new ArrayList<String>(windows);
//		list.clear();
//		list.addAll(windows);
		driver.switchTo().window(lists.get(0));
		String c=driver.getCurrentUrl();
		System.out.println(c);

	}

}
