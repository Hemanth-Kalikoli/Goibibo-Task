package pageObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(id="roundTrip")
	WebElement roundTrip;
	
	public WebElement roundTrip()
	{
		return roundTrip;
	}
	@FindBy(id="gosuggest_inputSrc")
	WebElement fromField;
	public WebElement fromField()
	{
		return fromField;
	}
	
	@FindBy(xpath="//input[@id='gosuggest_inputSrc']/following-sibling::ul/li")
	List<WebElement> fromSuggestList;
	public List<WebElement> fromSuggestedList()
	{
		return fromSuggestList;
	}
	
	@FindBy(id="gosuggest_inputDest")
	WebElement toField;
	public WebElement toField()
	{
		return toField;
	}
	
	@FindBy(xpath="//input[@id='gosuggest_inputDest']/following-sibling::ul/li")
	List<WebElement> toSuggestList;
	public List<WebElement> toSuggestedList()
	{
		return toSuggestList;
	}
	
	@FindBy(css="div.DayPicker-Caption")
	WebElement dayPicker;
	public WebElement dayPicker()
	{
		return dayPicker;
	}
	@FindBy(css="span.DayPicker-NavButton.DayPicker-NavButton--next")
	WebElement nextNavButton;
	public WebElement nextNavButton()
	{
		return nextNavButton;
	}
	
	@FindBy(className="calDate")
	List<WebElement> date;
	public List<WebElement> date()
	{
		return date;
	}
	@FindBy(id="gi_search_btn")
	WebElement searchButton;
	public WebElement searchButton()
	{
		return searchButton;
	}
}
