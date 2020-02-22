package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		driver.findElementByName("q").sendKeys("Hello World"+Keys.ENTER);
		String title=driver.getTitle();
		System.out.println("Ttitle is: "+title);
		driver.close();
		driver.quit();
	}

}
