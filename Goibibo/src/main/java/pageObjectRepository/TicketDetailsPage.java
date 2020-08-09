package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketDetailsPage
{
public WebDriver driver;
	public TicketDetailsPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); 
	}
	@FindBy(id="Adulttitle1")
	WebElement title;
	public WebElement title()
	{
	 return title;	
	}
	@FindBy(id="AdultfirstName1")
	WebElement adultFirstName;
	public WebElement adultFirstName()
	{
		return adultFirstName;
	}
	@FindBy(id="AdultlastName1")
	WebElement adultLastName;
	public WebElement adultLastName()
	{
		return adultLastName;
	}
    @FindBy(css="input[type='Email']")
    WebElement email;
    public WebElement email()
    {
    	return email;
    }
    @FindBy(css="input[id='mobile']")
    WebElement mobileNum;
    public WebElement mobileNum()
    {
    	return mobileNum;
    }
    @FindBy(xpath="//button/div")
    WebElement proceedToPay;
    public WebElement proceedToPay()
    {
    	return proceedToPay;
    }
    @FindBy(id="risk-trip")
    WebElement riskTrip;
    public WebElement riskTrip()
    {
    	return riskTrip;
    }
    
}
