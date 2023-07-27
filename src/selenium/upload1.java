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

public class upload1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/split_pdf");
		driver.manage().window().maximize();
		WebElement pdf=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		pdf.click();
		Thread.sleep(5000);
		String path="C:\\Users\\ADMIN\\Documents\\Custom Office Templates\\Resume.pdf";
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
