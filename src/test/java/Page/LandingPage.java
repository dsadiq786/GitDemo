package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By roundTrip = By.xpath("(//span[@class='tabsCircle appendRight5'])[2]");
	By fromLabel = By.xpath("//label[@for = 'fromCity']");
	By fromCity = By.xpath("//input[@placeholder = 'From']");
	By toCity  = By.xpath("//input[@placeholder = 'To']");
	By nextMonthbtn=By.xpath("//span[@aria-label='Next Month']");
	By depDate = By.xpath("(//p[text()='15'])[2]");
	By retDate = By.xpath("(//p[text()='25'])[2]");
	By search = By.xpath("//a[contains(@class,'primaryBtn font24')]");
	

	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
       
		this.driver = driver;

	}
	
	public WebElement getNextMonthbtn() {
		return driver.findElement(nextMonthbtn);
	}

	public WebElement getRoundTrip() {
		return driver.findElement(roundTrip);
	}

	public WebElement getFromLabel() {
		return driver.findElement(fromLabel);
	}
	
	public WebElement getFromCity() {
		return driver.findElement(fromCity);
	}
	
	public WebElement getToCity() {
		return driver.findElement(toCity);
	}
	
	public WebElement getDepDate() {
		return driver.findElement(depDate);
	}

	public WebElement getRetDate() {
		return driver.findElement(retDate);
	}

	public WebElement getSearch() {
		return driver.findElement(search);
	}
}
