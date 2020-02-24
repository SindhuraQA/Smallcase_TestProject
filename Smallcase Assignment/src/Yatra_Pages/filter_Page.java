package Yatra_Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class filter_Page {

	By Price_filter = By.xpath("//span[contains(text(),'Price')]");
	By Morning_filght = By.xpath("//div[@class=' pt-12 dtime font-lightgrey']/label[2]");
	By Filter_Apply = By.xpath("//input[contains(@value,'Apply Filters')]");
	By First_Flight_Logic = By.xpath("//div[contains(@class,'fare-group i-b')]");
	

	static WebDriver driver = null;
	
	static WebElement element;
	
	
public void filter_Page(WebDriver driver, WebElement  element)
{
	this.driver = driver;
	this.element = element;
}

public void Dropdown_Price_and_flight_timing()
{
	WebElement element5 = driver.findElement(Price_filter);
	element5.click();
	WebElement element6 = driver.findElement(Morning_filght);
	element6.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

public void Filter_Click()
{
	WebElement element7 = driver.findElement(Filter_Apply);
	element7.click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
public void Flight_Price()
{
	List <WebElement> flights = driver.findElements(By.xpath("//div[contains(@class,'fare-group i-b')]"));
    int count=flights.size();	 
    for(int i=0;i>count;i++)
    {
    	String price = flights.get(i).getText();
        System.out.println("The filght " + i +"ticket price is " + price);
    	}
   
}
}
