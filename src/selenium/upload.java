package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/file");
		driver.manage().window().maximize();
		WebElement upload=driver.findElement(By.xpath("//span[text()=' Choose a file… ']"));
		upload.click();
		Thread.sleep(5000);
		String path="C:\\Users\\Public\\Pictures\\Sample Pictures\\Jellyfish.jpg";
		StringSelection picture=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(picture,null);
		Robot a=new Robot();
		a.keyPress(KeyEvent.VK_CONTROL);
		a.keyPress(KeyEvent.VK_V);
		a.keyRelease(KeyEvent.VK_V);
		a.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);

	}

}
