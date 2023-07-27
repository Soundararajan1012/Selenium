package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singledropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		WebElement signupButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		signupButton.click();
		
		Thread.sleep(5000);//forceful wait
		WebElement ddMonth= driver.findElement(By.id("month"));
		ddMonth.click();
		
		Thread.sleep(5000);
		Select selectObj=new Select(ddMonth);
		selectObj.selectByIndex(10);//november//index always start with zero
		
		Thread.sleep(2000);
		selectObj.selectByValue("5");//May
		
		Thread.sleep(2000);
		selectObj.selectByVisibleText("Dec");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("-----------------");
		
		List<WebElement> list=selectObj.getOptions();
		WebElement firstIndex=list.get(0);
		System.out.println("First Index:"+firstIndex);
		String firstValue=firstIndex.getText();
		System.out.println("First Month Name:"+firstValue);
		
		WebElement lastIndex=list.get(11);
		System.out.println("Last Index:"+lastIndex);
		String lastValue=lastIndex.getText();
		System.out.println("Last Month Name:"+lastValue);
		
		int length=list.size()-1;//getting last index value
		//int length=list.size();
		System.out.println("length:"+length);
		
		WebElement lastIndexDynamic=list.get(length);//length11
		String lastValueDynamic=lastIndexDynamic.getText();
		System.out.println(lastValueDynamic);
		
		int middle=(selectObj.getOptions().size()/2)-1;
		
		WebElement middleIndex=list.get(middle);
		String middleValue=middleIndex.getText();
		System.out.println(middleValue);
		System.out.println("-------------------");
		
		for(int i=0;i<selectObj.getOptions().size();i++)
		{
			WebElement index=list.get(i);
			//String indexV=index.getAttribute("value");
			//System.out.println(indexV);
			String IndexValue=index.getText();
			System.out.println((i)+"--->"+IndexValue);
			
		}
		
		
	}

}
