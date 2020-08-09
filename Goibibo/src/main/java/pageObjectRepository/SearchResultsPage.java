package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
public WebDriver driver;
public SearchResultsPage(WebDriver driver) 
    {
		this.driver=driver;
		PageFactory.initElements(driver, this); 
	}
@FindBy(css="div[class*='flexCol fltHpyRsltCard']")
WebElement rsltCard;
public WebElement rsltCard()
{
	return rsltCard;
}
@FindBy(xpath="//div[@class='fltHpyOnwrdWrp']//ul/li[@id='PRICE']")
WebElement onSortPrice;
public WebElement onSortPrice()
{
	return onSortPrice;
}
@FindBy(xpath="//div[@class='fltHpyOnwrdWrp']//*[@id='PRICE']//i[contains(@class,'icon-arrow2-down')]")
WebElement onArrowDown;
public WebElement onArrowDown()
{
	return onArrowDown;
}

@FindBy(xpath="//div[@class='fltHpyRtrnWrp']//ul/li[@id='PRICE']")
WebElement rtnSortPrice;
public WebElement rtnSortPrice()
{
	return rtnSortPrice;
}
@FindBy(xpath="//div[@class='fltHpyRtrnWrp']//*[@id='PRICE']//i[contains(@class,'icon-arrow2-down')]")
WebElement rtrnArrowDown;
public WebElement rtrnArrowDown()
{
	return rtrnArrowDown;
}
@FindBy(xpath="//div[@class='fltHpyOnwrdWrp']//div[contains(@data-cy,'flightItem')][1]//span[@class='custRad']")
WebElement departureRadioBut;
public WebElement departureRadioBut() 
{
	return departureRadioBut;
}
@FindBy(xpath="//div[@class='fltHpyRtrnWrp']//div[contains(@data-cy,'flightItem')][1]//span[@class='custRad']")
WebElement returnRadioBut;
public WebElement returnRadioBut() 
{
	return returnRadioBut;
}
@FindBy(css="input[value='BOOK']")
WebElement bookBtn;
public WebElement bookBtn()
{
	return bookBtn;
}
}


