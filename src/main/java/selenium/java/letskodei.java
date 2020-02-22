package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class letskodei {

	public static void main(String[] args) {
		// https://letskodeit.teachable.com/p/practice
		
		WebDriver driver= library.launchChrome("https://letskodeit.teachable.com/p/practice");
		
		driver.findElement(By.id("bmwradio")).click();
		
		//carselect
		WebElement carselect= driver.findElement(By.id("carselect"));
		Select obj = new Select(carselect);
		obj.selectByVisibleText("Honda");
		
		//multiple-select-example
		WebElement multiSelect= driver.findElement(By.id("multiple-select-example"));
		Select Obj1 = new Select(multiSelect);
		Obj1.selectByVisibleText("Apple");
		Obj1.selectByVisibleText("Orange");
		
			
		driver.findElement(By.id("benzcheck")).click();
		driver.findElement(By.id("hondacheck")).click();
		
		//openwindow
		WebElement window= driver.findElement(By.id("openwindow"));
		window.click();
		//driver.close();--closes the first window
		//driver.quit();--closes all browser windows
		//driver.switchTo().window();
		System.out.println(library.h1);
		driver.switchTo().window(library.h1);
		
		driver.findElement(By.id("opentab")).click();
		driver.switchTo().window(library.h1);
		library.clearAndTypeValue(driver.findElement(By.id("name")), "Deepali");
		driver.findElement(By.id("alertbtn")).click();
	}

}
