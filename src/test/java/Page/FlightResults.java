package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightResults {

	public WebDriver driver;

	By depFlightMinPrice = By.xpath("(//p[@class = 'actual-price'])[1]");
	By retFlightMinPrice = By.xpath("(//p[@class = 'actual-price'])[2]");
	

	public FlightResults(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getDepFlightMinPrice() {
		return driver.findElement(depFlightMinPrice);
	}
	
	public WebElement getRetFlightMinPrice() {
		return driver.findElement(retFlightMinPrice);
	}

}
