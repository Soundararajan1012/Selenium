package Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
        driver.findElement(By.xpath("(//span[@class='input-arrow'])[1]")).click();
        driver.findElement(By.xpath("//input[@name='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("6789098765");
        driver.findElement(By.xpath("//input[@name='AuthenticationFG.ACCESS_CODE']")).sendKeys("Rajan7689");
        driver.findElement(By.xpath("//input[@name='Action.VALIDATE_CREDENTIALS']")).click();
	}

}
