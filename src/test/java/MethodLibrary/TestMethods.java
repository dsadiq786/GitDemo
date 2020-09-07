package MethodLibrary;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page.FlightResults;
import Page.LandingPage;


public class TestMethods  {

	

	WebDriver driver = null;
	WebDriverWait wait = null;

	LandingPage lp = null;
	FlightResults fr = null;

	public TestMethods(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		lp = new LandingPage(driver);
		fr = new FlightResults(driver);

		wait = new WebDriverWait(driver, 30);
	}

	public void clickOnRoundTrip() throws InterruptedException {

		Thread.sleep(1000);
		WebElement roundtrip = lp.getRoundTrip();
		try {
			roundtrip.click();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);

	}

	public void clickOnFromLabel() throws InterruptedException {

		WebElement clickFrom = lp.getFromLabel();
		try {
			clickFrom.click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		Thread.sleep(2000);
	}

	public void fillFromCity() throws InterruptedException {

		WebElement fillFrom = lp.getFromCity();
		fillFrom.sendKeys("COIMBATORE");
		Thread.sleep(3000);
		fillFrom.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		/*
		 * fillFrom.sendKeys(Keys.ARROW_DOWN); Thread.sleep(1000);
		 */
		fillFrom.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
	}

	public void fillToCity() throws InterruptedException {

		WebElement fillTo = lp.getToCity();
		fillTo.sendKeys("INDORE");
		Thread.sleep(3000);
		fillTo.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		fillTo.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
	}

	public void clickOnDepDate() throws InterruptedException {
//		String st=driver.findElement(By.xpath("//span[@class='selectedDateField appendBottom8 pointer']")).getText();
//		System.out.println(st);
//		String[] ar=st.split(" ");
//		int n=Integer.parseInt(ar[0]);
//		System.out.println(n);
		WebElement ClickOnNextMonth=lp.getNextMonthbtn();
		ClickOnNextMonth.click();
		ClickOnNextMonth.click();
		Thread.sleep(2000);
		WebElement clickDepDate = lp.getDepDate();
		clickDepDate.click();
		
		Thread.sleep(2000);
	}

	public void clickOnRetDate() throws InterruptedException {
        
		WebElement clickRetDate = lp.getRetDate();
		clickRetDate.click();
		
		Thread.sleep(2000);
	}

	public void clickOnSearch() throws InterruptedException {

		WebElement clickSearch = lp.getSearch();
		try {
			clickSearch.click();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		Thread.sleep(5000);
	}

	@SuppressWarnings("unused")
	public void getDepMinPrice() {

		WebElement clickDepMinPrice = fr.getDepFlightMinPrice();
		String depMinPrice = clickDepMinPrice.getText();
		System.out.println(depMinPrice);


	}

	public void getRetMinPrice() {

		WebElement clickRetMinPrice = fr.getRetFlightMinPrice();
		String retMinPrice = clickRetMinPrice.getText();
		System.out.println(retMinPrice);
		

	}
}
