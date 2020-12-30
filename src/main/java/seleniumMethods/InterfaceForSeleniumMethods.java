package seleniumMethods;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
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
	
	public void navigateForword(WebDriver driver);
	
	public void navigateBack(WebDriver driver);
	
	public String getTitle(WebDriver driver);
	
	public String getCurrentURL(WebDriver driver);
	
	public void highLightElement(WebDriver driver, WebElement element);
	
	public void swithToFrameByIdOrNameOrIndex(WebDriver driver, String type, String value);
	
	public void swithToFrameByWebelement(WebDriver driver, WebElement element);
	
	public void swithToDefaultContent(WebDriver driver);
	
	public Alert swithToAlert(WebDriver driver);
	
	public void acceptAlert(Alert alert);
	
	public void rejectAlert(Alert alert);
	
	public void rightClickOnPage(WebDriver driver);
	
	public void rightClickOnElement(WebDriver driver, WebElement element);
	
	public void doubleClickOnElement(WebDriver driver, WebElement element);
}
