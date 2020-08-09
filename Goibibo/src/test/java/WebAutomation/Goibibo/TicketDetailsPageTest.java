package WebAutomation.Goibibo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectRepository.TicketDetailsPage;

public class TicketDetailsPageTest extends SearchResultsPageTest{
@Test(priority=3)
public void ticketDetails()
{
	TicketDetailsPage tp=new TicketDetailsPage(driver);
	//Click on Risk Trip radio button
	tp.riskTrip().click();
	//Scroll to bottom of the page
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", tp.title() );
	//Select title
	Select s=new Select(tp.title());
	s.selectByVisibleText(prop.getProperty("title"));
	//Enter First Name
	tp.adultFirstName().sendKeys(prop.getProperty("firstName"));
	//Enter Last Name
	tp.adultLastName().sendKeys(prop.getProperty("lastName"));
	//Enter Email address
    tp.email().sendKeys(prop.getProperty("emailAddress"));
    //Enter Mobile Number
    tp.mobileNum().sendKeys(prop.getProperty("mobileNum"));    
    //Click on Proceed to Payments button
    tp.proceedToPay().click();
    
}
}
