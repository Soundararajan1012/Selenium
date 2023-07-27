package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipledropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");//navigate to the URL
		driver.manage().window().maximize();//maximizing window
		Select select=new Select(driver.findElement(By.id("cars")));//selecting the multiple element by locating its id
		System.out.println(select.isMultiple());
		System.out.println("The dropdown options are:");//get the list of all the options
		
		List<WebElement> options=select.getOptions();
		for(WebElement option:options)
		{
			System.out.println("Showing all the available "+"options"+option.getText());
		}
		//Using isMultiple() method to verify if the element is multiple-select
		//if yes go onto next steps else exit
		if(select.isMultiple())
		{
			//selecting option as 'Opel'--ByIndex
			System.out.println("Select option opel by Index");
			select.selectByIndex(2);
			//Thread.sleep(3000);
			//selecting option as 'saab'--ByValue
			System.out.println("Select option saab by Value");
			select.selectByValue("saab");
			//Thread.sleep(3000);
			//selecting option by text
			System.out.println("Select option Audi by Text");
			select.selectByVisibleText("Audi");
			//get the list of selected options
			System.out.println("The selected values in the dropdown options are:");
			
			List<WebElement> selectOptions=select.getAllSelectedOptions();
			for(WebElement webelement:selectOptions)
			{
				System.out.println("Showing selected options"+webelement.getText());
			}
			//Thread.sleep(3000);
			//deselect the value'Audi' by Index
			System.out.println("Deselect option Audi by Index");
			select.deselectByIndex(3);
			//Thread.sleep(3000);
			//deselect the value'Opel' by visible text
			System.out.println("DeSelect option Opel by text");
			select.deselectByVisibleText("Opel");
			//Thread.sleep(3000);
			//validate that both the values are deselected
			System.out.println("The selected values after deselect in the dropdown options are:");
			List<WebElement> selectedOptionsAfterDeselect=select.getAllSelectedOptions();
			for(WebElement selectedOptionsAfterDeselectWebElements:selectedOptionsAfterDeselect)
			{
				System.out.println("Showing selected options after deselect"+selectedOptionsAfterDeselectWebElements.getText());
			}
			//step#8-Deselect all values
			select.deselectAll();
			
		}
		
		
	}

}
