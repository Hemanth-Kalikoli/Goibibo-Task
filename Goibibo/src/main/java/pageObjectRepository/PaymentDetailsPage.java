package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetailsPage {
	public WebDriver driver;
public PaymentDetailsPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//span[text()='Wallets']")
WebElement walletBtn;
public WebElement walletBtn()
{
	return walletBtn;
}
}
