package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twoplugs.com/");
		driver.manage().window().maximize();
		//Flashing
		WebElement join=driver.findElement(By.xpath("(//a[@class='btn green'])[1]"));
		JsBase.flash(join,driver);
		JsBase.drawBorder(join,driver);
		String title=JsBase.getTitleUsingJs(driver);
		System.out.println(title);
		WebElement login=driver.findElement(By.xpath("(//span[text()='LOG in'])[1]"));
		JsBase.clickElementByJavaScript(login, driver);
//		JsBase.generateAlertviaJs(driver, "you entered into a login page...");
//		//driver.navigate().refresh();
//		//JsBase.refreshviaJs(driver);
//		WebElement image=driver.findElement(By.xpath("//*[@id='rslides3_s0']/div[1]/img"));
//		JsBase.scrollIntoView(image, driver);
//		JsBase.scrollPageDown(driver);

	}

}
