package seleniumMethods;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface InterfaceForSeleniumMethods {
	public void initiateBrowser(String browserName);

	public void initiateApplication(String browserName);
	
	public void click(WebElement element);
	
	public void sendKeys(WebElement element,String text);
	
	public boolean isSelected(WebElement element);
	
	public boolean isEnabled(WebElement element);
	
	public boolean isDisplayed(WebElement element);
	
	public String getAttributeValue(WebElement element,String attributeName);
	
	public void selectDropdownOption(WebElement element,String type,String value);
	
	public List<String> getAllOptionsInDropdown(WebElement element);
	
	public String getFirstSelectedOptionInDropdown(WebElement element);
	
}
