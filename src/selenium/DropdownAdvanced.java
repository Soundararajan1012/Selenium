package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAdvanced {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Course=driver.findElement(By.id("j_idt87:auto-complete_input"));
		Course.sendKeys("s");
		List<WebElement> option= driver.findElements(By.xpath("//*[@id=\"j_idt87:auto-complete_panel\"]/ul/li"));
		for(WebElement i:option)
        {
        	if(i.getText().equals("RestAssured"))
        	{
        		i.click();
        		System.out.println("Selected Course:"+i.getText());
            	Thread.sleep(2000);
        	}
        	}
    	Thread.sleep(2000);
    	WebElement Course1=driver.findElement(By.id("j_idt87:auto-complete_input"));
		Course1.sendKeys("p");
		Thread.sleep(2000);
		List<WebElement> option7= driver.findElements(By.xpath("//*[@id=\"j_idt87:auto-complete_panel\"]/ul/li"));
		for(WebElement e:option7)
        {
        	if(e.getText().equalsIgnoreCase("Postman"))
        	{
        		e.click();
        		System.out.println("Selected Course:"+e.getText());
        	}
        	}
		WebElement Tool=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select dropdown=new Select(Tool);
		dropdown.selectByIndex(4);
		WebElement country=driver.findElement(By.id("j_idt87:country_label"));
		country.click();
		List<WebElement> option1=driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']/li"));
		for(WebElement j:option1)
		{
			if(j.getText().equals("India"))
			{
				j.click();
				System.out.println("Selected Country:"+j.getText());
			}
		}
		WebElement Language=driver.findElement(By.id("j_idt87:lang_label"));
		Language.click();
		List<WebElement> option2=driver.findElements(By.xpath("//ul[@id='j_idt87:lang_items']/li"));
		for(WebElement k:option2)
		{
			if(k.getText().equals("Tamil"))
			{
				k.click();
				System.out.println("Selected Language:"+k.getText());
			}
		}
		WebElement City=driver.findElement(By.id("j_idt87:city_label"));
		City.click();
		List<WebElement> option3=driver.findElements(By.xpath("//ul[@id='j_idt87:city_items']/li"));
		for(WebElement l:option3)
		{
			if(l.getText().equals("Chennai"))
			{
				l.click();
				System.out.println("Selected City:"+l.getText());
			}
		}
		WebElement Value=driver.findElement(By.id("j_idt87:value_label"));
		Value.click();
		List<WebElement> option4=driver.findElements(By.xpath("//ul[@id='j_idt87:value_items']/li"));
		for(WebElement m:option4)
		{
			if(m.getText().equals("இரண்டு"))
			{
				m.click();
				System.out.println("Selected Value:"+m.getText());
			}
		}
		
	}

}
