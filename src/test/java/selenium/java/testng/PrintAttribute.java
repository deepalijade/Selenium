package selenium.java.testng;

import org.testng.annotations.Test;

import selenium.java.library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeTest;

public class PrintAttribute {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		System.out.println("I am running before test");
		driver = library.launchChrome("https://letskodeit.teachable.com/p/practice");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void print() {

		List<WebElement> elements = driver.findElements(By.xpath("//input[@name='cars' and @type='checkbox']"));
		System.out.println("Number Of Elements: " + elements.size());

		for (int i = 0; i < elements.size(); i++) {

			System.out.println("Elements are : " + elements.get(i).getAttribute("value"));
		}
	}


	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
		driver.close();
	}
}
