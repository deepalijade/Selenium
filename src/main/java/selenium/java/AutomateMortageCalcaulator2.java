package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AutomateMortageCalcaulator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = library.launchChrome("https://www.mortgagecalculator.org/");
		driver.findElement(By.xpath("//label[text()=' Home Value: ']/following-sibling::input")).clear();
		driver.findElement(By.xpath("//label[text()=' Home Value: ']/following-sibling::input")).sendKeys("500000");

		driver.findElement(By.xpath("(//input[@class='right-cell'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@class='right-cell'])[2]")).sendKeys("25000");

		//driver.findElement(By.name("param[principal]")).clear();
		//driver.findElement(By.name("param[principal]")).sendKeys("300000");

		driver.findElement(By.xpath("(//input[@class='right-cell'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@class='right-cell'])[4]")).sendKeys("1.3");

		// LoanTerm
		library.clearAndTypeValue(driver.findElement(By.id("loanterm")), "35");

		WebElement startMonth = driver.findElement(By.name("param[start_month]"));
		Select obj = new Select(startMonth);
		obj.selectByVisibleText("Mar");

		// Start Year--
		library.clearAndTypeValue(driver.findElement(By.id("start_year")), "2020");

		// Property Tax
		library.clearAndTypeValue(driver.findElement(By.id("pptytax")), "5000");
		
		// PMI
		library.clearAndTypeValue(driver.findElement(By.id("pmi")), "3.3");
		

		// Home Ins
		library.clearAndTypeValue(driver.findElement(By.id("hoi")), "500");
		

		// Monthly HOA
		library.clearAndTypeValue(driver.findElement(By.id("hoa")), "100");
		

		// Loan Type
		WebElement loantype = driver.findElement(By.name("param[milserve]"));
		Select obj1 = new Select(loantype);
		obj1.selectByIndex(2);
		
		// Buy or Refi
		WebElement buy = driver.findElement(By.name("param[refiorbuy]"));
		Select obj2 = new Select(buy);
		obj2.selectByValue("2");
		
		// Credit Rating
		WebElement rating = driver.findElement(By.id("credit_rating"));
		Select obj3 = new Select(rating);
		obj3.selectByVisibleText("Excellent (720+)");
		//Anonymous object
		//new Select(driver.findElement(By.name("param[milserve]"))).selectByIndex(1); 
		
		
		// Click Calculate -- name
		driver.findElement(By.name("cal")).click();
		Thread.sleep(5000);
		
		//---(//div[@class='repayment-block']//h3)[2]
		WebElement result= driver.findElement(By.xpath("//div[@class='repayment-block']//h3"));
		String s = result.getText();
		System.out.println("Monthly Payement : " +s);
		
	}

}
