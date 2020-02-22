package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class library {

	static String h1;
	public static WebDriver launchChrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		return driver;
	}
	public static WebDriver launchChrome(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get(url);
		h1=driver.getWindowHandle();
		return driver;
	}
	
	public static void clearAndTypeValue(WebElement element, String args)
	{
		element.clear();
		element.sendKeys(args);
	}
}
