package WebAutomation.Goibibo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjectRepository.PaymentDetailsPage;

public class PaymentDetailsPageTest extends TicketDetailsPageTest{
	@Test(priority=4)
public void paymentDetails()
{
	PaymentDetailsPage pg=new PaymentDetailsPage(driver);
	//Wait until Payment Container loads
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//Scroll to bottom of the page
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	//Click on Wallets button
	pg.walletBtn().click();
}
}
