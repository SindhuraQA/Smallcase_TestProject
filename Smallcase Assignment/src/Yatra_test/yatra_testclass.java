package Yatra_test;
import Yatra_Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yatra_testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement element = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu Lingaraju\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		driver.get("http://yatra.com");
		driver.manage().window().maximize();
		
		home_page object = new home_page(driver,element);
		object.select_city("Bangalore", "New Delhi");
		object.flight_mode();
		object.searchFlight_SetDate();
		
		filter_Page object1 = new filter_Page();
		object1.Dropdown_Price_and_flight_timing();
		object1.Filter_Click();
		object1.Flight_Price();
		
	}

}
