package WebAutomation.Goibibo;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjectRepository.HomePage;


public class HomePageTest extends Base{
	public WebDriver driver;
	@Test(priority=1)
	public void launchBrowser() throws IOException
	{
		//Initialize Driver
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		HomePage hp=new HomePage(driver);
		hp.roundTrip().click();
		//Enter Source
		hp.fromField().sendKeys("Del");
		List<WebElement> fromList=hp.fromSuggestedList();
		for(WebElement option:fromList) 
		{
			if(option.getText().contains("Delhi"))
			{
				option.click();
				break; 
			}
		}
		//Enter Destination
		hp.toField().sendKeys("Mum");
		List<WebElement> toList=hp.toSuggestedList();
		for(WebElement option:toList) 
		{
			if(option.getText().contains("Mumbai"))
			{
				option.click();
				break; 
			}
		}
		
		//Select Departure Month and Date
		WebElement dayPick=hp.dayPicker();
		while(!dayPick.getText().contains("September"))
		{
			hp.nextNavButton().click();
		}
		List<WebElement> dateCheck=hp.date();
		for(int i=0;i<dateCheck.size();i++)
		{
			String dates=dateCheck.get(i).getText();
			String[] split=dates.split("\n");
			String trimValue=split[0].trim();
	
			if(trimValue.equalsIgnoreCase("3"))
			{
				dateCheck.get(i).click();
				break;
			}
		}
		//Select Return Month and Date
		WebElement ReturnDayPick=hp.dayPicker();
		while(!ReturnDayPick.getText().contains("September"))
		{
			hp.nextNavButton().click();
		}
		List<WebElement> returnDate=hp.date();
		for(int i=0;i<returnDate.size();i++)
		{
			String dates=returnDate.get(i).getText();
			String[] split1=dates.split("\n");
			String trimValue1=split1[0].trim();
	
			if(trimValue1.equalsIgnoreCase("5"))
			{
				returnDate.get(i).click();
				break;
			}
		}
		//Click on Search button
		hp.searchButton().click();
	
	}
}

