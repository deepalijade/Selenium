package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://shop.demoqa.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		
		driver.get(url);
		
		String address = driver.findElement(By.tagName("address")).getText();
		System.out.println(address);
		String t = driver.findElement(By.xpath(".//span[text()='T']//following-sibling::a")).getText();
		System.out.println(t);
		//String mail= driver.findElement(By.xpath(""))
		
		driver.close();
		
		
		
	}

}
