package Day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Registration
//		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
//		driver.findElement(By.id("username")).sendKeys("muppidathi");
//		driver.findElement(By.id("password")).sendKeys("muppidathi123@");
//		driver.findElement(By.id("re_password")).sendKeys("muppidathi123@");
//		driver.findElement(By.id("full_name")).sendKeys("muppidathiprema");
//		driver.findElement(By.id("email_add")).sendKeys("muppidathiprema@gmail.com");
//		Thread.sleep(10000);
//		driver.findElement(By.id("tnc_box")).click();
//		driver.findElement(By.id("Submit")).click();
//		driver.findElement(By.xpath("//a[text()='Go back to Login page']")).click();
		//Login
		driver.findElement(By.id("username")).sendKeys("muppidathi");
		driver.findElement(By.id("password")).sendKeys("muppidathi123@");
		driver.findElement(By.id("login")).click();
		//search Hotel
		WebElement location=driver.findElement(By.id("location"));
		Select locationdd=new Select(location);
		locationdd.selectByVisibleText("Melbourne");
		WebElement hotels=driver.findElement(By.id("hotels"));
		Select hotelsdd=new Select(hotels);
		hotelsdd.selectByVisibleText("Hotel Sunshine");
		WebElement room=driver.findElement(By.id("room_type"));
		Select roomdd=new Select(room);
		roomdd.selectByVisibleText("Standard");
		
		WebElement roomno=driver.findElement(By.id("room_nos"));
		Select roomnodd=new Select(roomno);
		roomnodd.selectByVisibleText("2 - Two");
//		driver.findElement(By.id("datepick_in")).sendKeys("23/04/2023");
//		driver.findElement(By.id("datepick_out")).sendKeys("25/04/2023");
		WebElement adultroom=driver.findElement(By.id("adult_room"));
		Select adultroomdd=new Select(adultroom);
		adultroomdd.selectByVisibleText("1 - One");
		WebElement childroom=driver.findElement(By.id("child_room"));
		Select childroomdd=new Select(childroom);
		childroomdd.selectByVisibleText("1 - One");
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("raja");
		driver.findElement(By.id("last_name")).sendKeys("kumar");
		driver.findElement(By.id("address")).sendKeys("No6, sivaraman street,Chennai-600028");
		driver.findElement(By.id("cc_num")).sendKeys("8909870998764523");
		WebElement cctype= driver.findElement(By.id("cc_type"));
		Select cctypedd=new Select(cctype);
		cctypedd.selectByVisibleText("Master Card");
		WebElement expirymonth= driver.findElement(By.id("cc_exp_month"));
		Select expirymonthdd=new Select(expirymonth);
		expirymonthdd.selectByVisibleText("May");
		WebElement expiryyear= driver.findElement(By.id("cc_exp_year"));
		Select expiryyeardd=new Select(expiryyear);
		expiryyeardd.selectByVisibleText("2022");
		driver.findElement(By.id("cc_cvv")).sendKeys("789");
		driver.findElement(By.id("book_now")).click();
		WebElement orderno= driver.findElement(By.id("order_no"));
		String s=orderno.getAttribute("value");
		System.out.println("Order No:"+s);

	}

}
