package selenium.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppintSiteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String address="http://shop.demoqa.com/";
		driver.get(address);
		
		WebElement message=driver.findElementByXPath("/html/body/p");
		System.out.println(message.getText());
		driver.findElementByXPath("/html/body/p/a").click();
		
		
		
	}

}
