package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MortageCalculatorAutomation {

	public static void main(String[] args) throws Exception {

		WebDriver driver = library.launchChrome("https://www.mortgagecalculator.org/");
		/*driver.findElement(By.id("homeval")).clear();
		driver.findElement(By.id("homeval")).sendKeys("1000");
		*/
		library.clearAndTypeValue(driver.findElement(By.id("homeval")), "1000");
		Thread.sleep(2000);

		/* downpayment
		driver.findElement(By.id("downpayment")).clear();
		driver.findElement(By.id("downpayment")).sendKeys("100");
		*/
		library.clearAndTypeValue(driver.findElement(By.id("downpayment")), "100");
		Thread.sleep(2000);

		// loanamt
		driver.findElement(By.id("loanamt")).clear();
		driver.findElement(By.id("loanamt")).sendKeys("1100");
		Thread.sleep(2000);

		// interest rate
		driver.findElement(By.id("intrstsrate")).clear();
		driver.findElement(By.id("intrstsrate")).sendKeys("4.4");
		Thread.sleep(2000);

		// LoanTerm
		driver.findElement(By.id("loanterm")).clear();
		driver.findElement(By.id("loanterm")).sendKeys("20");
		Thread.sleep(2000);

		WebElement startMonth = driver.findElement(By.name("param[start_month]"));
		Select obj = new Select(startMonth);
		obj.selectByVisibleText("Feb");
		Thread.sleep(2000);

		// Start Year--
		driver.findElement(By.id("start_year")).clear();
		driver.findElement(By.id("start_year")).sendKeys("2019");
		Thread.sleep(2000);

		// Property Tax
		driver.findElement(By.id("pptytax")).clear();
		driver.findElement(By.id("pptytax")).sendKeys("5000");
		Thread.sleep(2000);

		// PMI
		driver.findElement(By.id("pmi")).clear();
		driver.findElement(By.id("pmi")).sendKeys("3.3");
		Thread.sleep(2000);

		// Home Ins
		driver.findElement(By.id("hoi")).clear();
		driver.findElement(By.id("hoi")).sendKeys("500");
		Thread.sleep(2000);

		// Monthly HOA
		driver.findElement(By.id("hoa")).clear();
		driver.findElement(By.id("hoa")).sendKeys("100");
		Thread.sleep(2000);

		// Loan Type
		WebElement loantype = driver.findElement(By.name("param[milserve]"));
		Select obj1 = new Select(loantype);
		obj1.selectByVisibleText("FHA");
		Thread.sleep(2000);

		// Buy or Refi
		WebElement buy = driver.findElement(By.name("param[refiorbuy]"));
		Select obj2 = new Select(buy);
		obj2.selectByVisibleText("Buy");
		Thread.sleep(2000);

		// Credit Rating
		WebElement rating = driver.findElement(By.id("credit_rating"));
		Select obj3 = new Select(rating);
		obj3.selectByVisibleText("Excellent (720+)");
		Thread.sleep(2000);

		// Click Calculate -- name
		driver.findElement(By.name("cal")).click();
		Thread.sleep(2000);

	}

}
