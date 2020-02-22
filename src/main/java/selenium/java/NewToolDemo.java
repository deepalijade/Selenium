package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToolDemo {

	public static void main(String[] args) throws Exception{

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String address="https://www.amazon.com/";
		driver.get(address);
		
		driver.findElementById("nav-hamburger-menu").click();
		Thread.sleep(2000);
		driver.findElementById("hmenu-customer-name").click();
	}

}
