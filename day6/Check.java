import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Check {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/home/student/vijay/Automation/drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	String Url = "https://www.google.com/";
	
	String expectedTitle = "Google";
	driver.get(Url);
	
	String actualTitle = driver.getTitle();
	
	if(actualTitle.equals(expectedTitle)) {
		System.out.println("Passed");
	} else {
		System.out.println("failed");
	}
}
}