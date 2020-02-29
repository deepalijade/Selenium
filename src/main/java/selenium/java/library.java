package selenium.java;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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
	
	public static WebDriver launchChromeRemote(String url) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		WebDriver temp = new RemoteWebDriver(new URL("http://192.168.86.235:4444/wd/hub"), capability);
		//WebDriver temp=new ChromeDriver();
		temp.get(url);
		return temp;
	}
}
