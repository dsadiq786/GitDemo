package MMT_Script;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MethodLibrary.SelectBrowser;
import MethodLibrary.TestMethods;


public class CaseStudy{
    WebDriver driver=null;
	SelectBrowser sc=null;
	TestMethods tm = null;

	@BeforeTest
	public void initialize() throws IOException {
         sc=new SelectBrowser();
		driver =sc.initializeDriver();
		tm = new TestMethods(driver);
	}

	@Test()
	public void basePageNavigation() throws IOException, InterruptedException {

		
		try {
			driver.get(sc.data.getProperty("URL"));
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		Thread.sleep(2000);
		sc.getScreenshot(1);
		
		tm.clickOnRoundTrip();
		sc.getScreenshot(2);
		tm.clickOnFromLabel();
		tm.fillFromCity();
		sc.getScreenshot(3);
		
		tm.fillToCity();
		sc.getScreenshot(4);
		
		tm.clickOnDepDate();
		sc.getScreenshot(5);
		tm.clickOnRetDate();
		sc.getScreenshot(6);
		tm.clickOnSearch();
		sc.getScreenshot(7);
		tm.getDepMinPrice();
		tm.getRetMinPrice();
	}

	
	
//	  @AfterTest
//	  public void teardown() {
//	  
//	  driver.quit(); driver = null;
//	  
//	  }
	 
	 
}
