package seleniumMethods;

import java.util.List;

import org.openqa.selenium.Alert;
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
	
	public void navigateForword();
	
	public void navigateBack();
	
	public void refreshPage();
	
	public String getTitle();
	
	public String getCurrentURL();
	
	public void highLightElement(WebElement element);
	
	public void swithToFrameByIdOrNameOrIndex(String type, String value);
	
	public void swithToFrameByWebelement(WebElement element);
	
	public void swithToDefaultContent();
	
	public Alert swithToAlert();
	
	public void acceptAlert(Alert alert);
	
	public void rejectAlert(Alert alert);
	
	public void rightClickOnPage();
	
	public void rightClickOnElement(WebElement element);
	
	public void doubleClickOnElement(WebElement element);
	
	public void scrollIntoView(WebElement element);
	
	public String getText(WebElement element);
	
	public void closeBrowser();
	
	public void quitBrowser();
}
