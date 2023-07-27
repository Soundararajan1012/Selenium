package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement email=driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','test@gmail.com')", email);
		String username=(String) js.executeScript("return arguments[0].getAttribute('value')", email);
		System.out.println("username--->"+username);
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.name("pass"));
		js.executeScript("arguments[0].setAttribute('value','abc@123')", password);
		WebElement login=driver.findElement(By.name("login"));
		//js.executeScript("arguments[0].click()",login);
		js.executeScript("arguments[0].scrollIntoView(true)", login);//top to bottom
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)", login);//bottom to top
		js.executeScript("arguments[0].click()",login);

	}

}
