package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml;jsessionid=node0svt1g03jxhjlnob3mn4diymm256925.node0");
        WebElement dashboard= driver.findElement(By.linkText("Go to Dashboard"));
        dashboard.click();
        driver.navigate().back();
        WebElement dupdashboard= driver.findElement(By.linkText("Go to Dashboard"));
        dupdashboard.click();
        driver.navigate().back();
        WebElement withoutClick=driver.findElement(By.linkText("Find the URL without clicking me."));
        String s=withoutClick.getAttribute("href");
        System.out.println("WithoutClick Link:"+s);
        driver.findElement(By.linkText("How many links in this page?")).click();
        List<WebElement> count=driver.findElements(By.tagName("a"));
        System.out.println("Total Link:"+count.size());
        driver.navigate().back();
        WebElement brokenlink=driver.findElement(By.linkText("Broken?"));
        brokenlink.click();
        if(driver.getTitle().contains("404"))
        {
          System.out.println("This is a Broken Link");
        }
        driver.navigate().back();
        WebElement layout=driver.findElement(By.linkText("How many links in this layout?"));
        layout.click();
        List<WebElement> layout1=driver.findElements(By.tagName("a"));
        System.out.println("Total Layout:"+layout1.size());
        driver.navigate().back();
	}

}
