package WebAutomation.Goibibo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectRepository.SearchResultsPage;
public class SearchResultsPageTest extends HomePageTest{
	@Test(priority=2)
	public void searchResults()
	{
		SearchResultsPage sr=new SearchResultsPage(driver);
		WebDriverWait w=new WebDriverWait(driver,50);
		w.until(ExpectedConditions.elementToBeClickable(sr.rsltCard()));
		//Click on Departure Sort Price
		sr.onSortPrice().click();
	    sr.onArrowDown().isDisplayed();
	    Assert.assertTrue(true);
		//Click on Return Sort Price
		sr.rtnSortPrice().click();
		sr.rtrnArrowDown().isDisplayed();
		Assert.assertTrue(true);
		//Click on Departure Radio Button of Highest Price
		sr.departureRadioBut().click();
		//Click on Return Radio Button of Highest Price
		sr.returnRadioBut().click();
		//Click on Book button
		sr.bookBtn().click();
		
	}
}
