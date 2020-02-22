package selenium.java.testng;

import org.testng.annotations.Test;

import selenium.java.library;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class FirstTestNG {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Method");
	}

	WebDriver driver;

	@Test
	public void myFirstTestCase() {
		System.out.println("First");
		driver = library.launchChrome("https://letskodeit.teachable.com/p/practice");
		driver.findElement(By.id("bmwradio")).click();

		WebElement Make = driver.findElement(By.id("carselect"));
		Select obj1= new Select(Make);
		obj1.selectByVisibleText("Benz");

		//WebElement Fruit= driver.findElement(By.name("multiple-select-example"));
		new Select(driver.findElement(By.name("multiple-select-example"))).selectByVisibleText("Peach");
		
		driver.findElement(By.xpath("(//input[@name='cars' and @type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@name='cars' and @type='checkbox'])[2]")).click();
		
		
		// to fail that test case
		//driver.findElement(By.id("xyz")).click();

	}

	public void mySecondTestCase() {
		System.out.println("Second");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Method");
		//driver.close();
	}

}
