package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MortageCalculator{

	public static void main(String[] args) throws Exception {

		WebDriver driver = library.launchChrome("https://www.mortgagecalculator.org/");
		
		library.clearAndTypeValue(driver.findElement(By.id("homeval")), "500");
		Thread.sleep(500);

		//downpayment
		library.clearAndTypeValue(driver.findElement(By.id("downpayment")), "100");
		Thread.sleep(500);

		// loanamt
		library.clearAndTypeValue(driver.findElement(By.id("loanamt")),"1100");
		Thread.sleep(500);

		// interest rate
		library.clearAndTypeValue(driver.findElement(By.id("intrstsrate")),"4.4");
		Thread.sleep(500);

		// LoanTerm
		library.clearAndTypeValue(driver.findElement(By.id("loanterm")),"20");
		Thread.sleep(500);

		WebElement startMonth = driver.findElement(By.name("param[start_month]"));
		Select obj = new Select(startMonth);
		obj.selectByVisibleText("Feb");
		Thread.sleep(500);

		// Start Year--
		library.clearAndTypeValue(driver.findElement(By.id("start_year")),"2019");
		Thread.sleep(500);

		// Property Tax
		library.clearAndTypeValue(driver.findElement(By.id("pptytax")),"5000");
		Thread.sleep(500);

		// PMI
		library.clearAndTypeValue(driver.findElement(By.id("pmi")),"3.3");
		Thread.sleep(500);

		// Home Ins
		library.clearAndTypeValue(driver.findElement(By.id("hoi")),"500");
		Thread.sleep(500);

		// Monthly HOA
		library.clearAndTypeValue(driver.findElement(By.id("hoa")),"100");
		Thread.sleep(500);

		// Loan Type
		WebElement loantype = driver.findElement(By.name("param[milserve]"));
		Select obj1 = new Select(loantype);
		obj1.selectByVisibleText("FHA");
		Thread.sleep(500);

		// Buy or Refi
		WebElement buy = driver.findElement(By.name("param[refiorbuy]"));
		Select obj2 = new Select(buy);
		obj2.selectByVisibleText("Buy");
		Thread.sleep(500);

		// Credit Rating
		WebElement rating = driver.findElement(By.id("credit_rating"));
		Select obj3 = new Select(rating);
		obj3.selectByVisibleText("Excellent (720+)");
		Thread.sleep(500);

		// Click Calculate -- name
		driver.findElement(By.name("cal")).click();
		Thread.sleep(500);
		
		System.out.println("Mortgae Repayment Summary!");
		
		WebElement  str = driver.findElement(By.className("repayment-block"));
		//WebElement str = driver.findElement(By.xpath("//h3"));
		System.out.println(str.getText());
		
		
		/*xpath combinations--//tag[@'attribue']--""are fine as well, ''use in java code.
		 * (//input[@class='right-cell'])[1]
		 * //input[@class='right-cell']
		 * //label[text()=' Home Value: ']
		 * //label[text()=' Home Value: ']/following-sibling::input
		 */
		
		
	}

}
