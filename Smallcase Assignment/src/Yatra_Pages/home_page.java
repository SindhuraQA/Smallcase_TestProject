package Yatra_Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class home_page {

	By flight_origin = By.xpath("//input[@name=\"flight_origin\" and @id=\"BE_flight_origin_city\"]");
	By flight_destination = By.xpath("//input[@name=\"flight_destination\" and @id=\"BE_flight_arrival_city\"]");
	By search = By.xpath("//input[@id=\"BE_flight_flsearch_btn\"]");
	By mode = By.xpath("//div[@class=\"filter-list\"]");
	By departure_date = By.xpath("//td[contains(text(),'24')and @id='24/02/2020']");

    static WebDriver driver = null;
	
	static WebElement element;
	
public home_page(WebDriver driver2, WebElement element2) {
		// TODO Auto-generated constructor stub
	}
public void home_page(WebDriver driver ,WebElement element)
{
	this.driver = driver;
	this.element = element;
}
public void select_city(String arrival,String destination)
{
	WebElement element = driver.findElement(flight_origin);
	element.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	element.sendKeys(arrival);
	element.sendKeys(Keys.chord(Keys.ENTER));
	
	WebElement element1 = driver.findElement(flight_destination);
	element1.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	element1.sendKeys(destination);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	element.sendKeys(Keys.chord(Keys.ENTER));
	
}
public void flight_mode()
{
	WebElement element3 =driver.findElement(mode);
	element3.click();
}

public void searchFlight_SetDate()
{
	WebElement element4 =driver.findElement(search);
	element4.click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement element5 =driver.findElement(departure_date);
	element5.click();
	element4.click();
}
}
