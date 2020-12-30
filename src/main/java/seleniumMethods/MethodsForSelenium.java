package seleniumMethods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class MethodsForSelenium implements InterfaceForSeleniumMethods {
	WebDriver driver;

	@Override
	public void initiateBrowser(String browserName) {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

	}

	@Override
	public void initiateApplication(String browserName) {
		driver.get(browserName);
	}

	@Override
	public void click(WebElement element) {
		element.click();
	}

	@Override
	public void sendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}

	@Override
	public boolean isSelected(WebElement element) {
		boolean b = element.isSelected();
		return b;
	}

	@Override
	public boolean isEnabled(WebElement element) {
		boolean b = element.isEnabled();
		return b;
	}

	@Override
	public boolean isDisplayed(WebElement element) {
		boolean b = element.isDisplayed();
		return b;
	}

	@Override
	public String getAttributeValue(WebElement element, String attributeName) {
		String attributeValue = element.getAttribute(attributeName);
		return attributeValue;
	}

	@Override
	public void selectDropdownOption(WebElement element, String type, String value) {

		Select dropdown = new Select(element);
		
		 switch(type) { 
		 case "index": dropdown.selectByIndex(Integer.parseInt(value));
		 case "value": dropdown.selectByValue(value); 
		 case "visibletext":dropdown.selectByVisibleText(value); 
		 }
		 

	}

	@Override
	public List<String> getAllOptionsInDropdown(WebElement element) {
		Select dropdown = new Select(element);
		List<WebElement> options = dropdown.getOptions();
		List<String> dropdownOptions = new ArrayList<String>();
		for (WebElement dropdownElement : options) {
			dropdownOptions.add(dropdownElement.getText());
		}

		return dropdownOptions;
	}

	@Override
	public String getFirstSelectedOptionInDropdown(WebElement element) {
		Select dropdown = new Select(element);
		String option = dropdown.getFirstSelectedOption().getText();
		return option;
	}

	@Override
	public void navigateForword(WebDriver driver) {
		driver.navigate().forward();
	}

	@Override
	public void navigateBack(WebDriver driver) {
		driver.navigate().back();

	}

	@Override
	public String getTitle(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}

	@Override
	public String getCurrentURL(WebDriver driver) {
		String url = driver.getCurrentUrl();
		return url;
	}

	@Override
	public void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}

	@Override
	public void swithToFrameByIdOrNameOrIndex(WebDriver driver, String type, String value) {
		
		 switch(type) { 
		 case "index": driver.switchTo().frame(Integer.parseInt(value));
		 case "name": driver.switchTo().frame(value);
		 case "id":driver.switchTo().frame(value); 
		 }
		 
	}
	
	@Override
	public void swithToFrameByWebelement(WebDriver driver, WebElement element) {
		 driver.switchTo().frame(element);  
	}
	
	@Override
	public Alert swithToAlert(WebDriver driver) {
		 Alert alert = driver.switchTo().alert();
		return alert;
	}

	@Override
	public void acceptAlert(Alert alert) {
		alert.accept();
	}

	@Override
	public void rejectAlert(Alert alert) {
		alert.dismiss();
	}
}
