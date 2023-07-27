package selenium;


	

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;
	import java.util.NoSuchElementException;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Reusable2 {
		public static  WebDriver driver; //global variable
		//webdriver
		public  static WebDriver getDriver() {
			
			ChromeOptions co=new ChromeOptions();
		    co.addArguments("--remote-allow-origins=*");
		    System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
		    driver=new ChromeDriver(co);
		    driver.manage().window().maximize();
			return driver;
			
		}
		//URL
		public static void  loadUrl(String url) {
			
		driver.get(url);	
		}
		//SendKey
		public static void sendInput(WebElement element,String Input)
		{
			element.sendKeys(Input);
		}
		//Button Click
		public static void buttonclick(WebElement element)
		{
			element.click();
		}
		//dropdown
		//selectbyIndex
		public static void SelectIndex(WebElement web,int i)
		{
			Select s=new Select(web);
			s.selectByIndex(i);
		}
		//selectbyVisibleText
		public static void Selectvisibletext(WebElement web,String text)
		{
			Select s=new Select(web);
			s.selectByVisibleText(text);
		}
		//selectByValue
		public static void Selectvalue(WebElement web,String value)
		{
			Select s=new Select(web);
			s.selectByValue(value);
		}
	//alert method
		//alert accept
		public static void accept(WebDriver driver)
		{
			Alert obj=driver.switchTo().alert();
			obj.accept();
		}
		//alert dismiss
		public static void dismiss(WebDriver driver)
		{
			Alert obj=driver.switchTo().alert();
			obj.dismiss();
		}
		//alert sendvalues
		public static void alertsend(WebDriver driver,String s)
		{
			Alert obj=driver.switchTo().alert();
			obj.sendKeys(s);
		}
		//window commands
		//Window Maximize
		public static void max(WebDriver driver)
		{
			driver.manage().window().maximize();
		}
		//Window Close
		public static void close(WebDriver driver)
		{
			driver.close();
		}
		//Window Quit
		public static void quit(WebDriver driver)
		{
			driver.quit();
		}
		//Full Screen
		public static void fullscr(WebDriver driver)
		{
			driver.manage().window().fullscreen();
		}
		//screenshot
		public static void screenshot(WebDriver driver,String s) throws IOException
		{
			TakesScreenshot obj=(TakesScreenshot) driver;
			//String timestamp=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
			File src=obj.getScreenshotAs(OutputType.FILE);
			File des=new File(s);
			org.openqa.selenium.io.FileHandler.copy(src, des);
		}
		//implicitwait
		public static void implicitwait(int time) 
		{
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
		}
		//explicitwait
		public static void explicitwait(int time, WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		//fluent wait
		public static void fluentwait(int time,WebDriver driver)
		{
			Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(time))
					.pollingEvery(Duration.ofSeconds(time))
					.ignoring(NoSuchElementException.class);
			
		}
		//Actions
		//i)click[webelement]
		public static void click(WebElement web,WebDriver driver)
		{
			Actions a=new Actions(driver);
			a.click(web).build().perform();
		}
		//ii)doubleclick
		public static void doubleclick(WebDriver driver,WebElement web)
		{
			Actions a=new Actions(driver);
			a.doubleClick(web).build().perform();
		}
		//iii)contextclick
		public static void contextclick(WebDriver driver,WebElement web)
		{
			Actions a=new Actions(driver);
			a.contextClick(web).build().perform();
		}
		//iv)clickandHold
		public static void clickandhold(WebDriver driver,WebElement web)
		{
			Actions a=new Actions(driver);
			a.clickAndHold(web).build().perform();
		}
		//v)moveToElement
		public static void movetoelement(WebDriver driver,WebElement web)
		{
			Actions a=new Actions(driver);
			a.moveToElement(web).build().perform();
		}
		//vi)Release
		public static void release(WebDriver driver,WebElement web)
		{
			Actions a=new Actions(driver);
			a.release(web).build().perform();
		}
		//vii)draganddrop
		public static void draganddrop(WebDriver driver,WebElement web1,WebElement web2)
		{
			Actions a=new Actions(driver);
			a.dragAndDrop(web1, web2).build().perform();
		}
		//Robot
		//i)keydown
		public static void keydown() throws AWTException
		{
			Robot a=new Robot();
			a.keyPress(KeyEvent.VK_DOWN);
			a.keyRelease(KeyEvent.VK_DOWN);
		}
		//ii)keyenter
		public static void keyenter() throws AWTException
		{
			Robot a=new Robot();
			a.keyPress(KeyEvent.VK_ENTER);
			a.keyRelease(KeyEvent.VK_ENTER);
		}
		//iFrame
		public static void iframe(WebElement s,WebDriver driver)
		{
			driver.switchTo().frame(s);
		}
		//Window Handling
		public static void windowhandles(WebDriver driver,int s)
		{
			Set<String> a=driver.getWindowHandles();
			List<String> b=new ArrayList<String>(a);
			driver.switchTo().window(b.get(s));
		}
		//webTable
//		public static void table()
//		{
//			List<WebElement> row=
//		}
		//window handle
		public static void windowhandle()
		{
			String window=driver.getWindowHandle();
			System.out.println(window);
			
		}
		public static void windowhandles() {
			String window=driver.getWindowHandle();
			System.out.println(window);
			Set<String>first=driver.getWindowHandles();
			for(String f:first) {
				System.out.println(f);
				if(!f.equals(window)) {
					driver.switchTo().window(f);
				}
			}
		}


		
	}

