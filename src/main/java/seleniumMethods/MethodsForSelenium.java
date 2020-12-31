package seleniumMethods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
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
	public void navigateForword() {
		driver.navigate().forward();
	}

	@Override
	public void navigateBack() {
		driver.navigate().back();

	}

	@Override
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	@Override
	public String getCurrentURL() {
		String url = driver.getCurrentUrl();
		return url;
	}

	@Override
	public void highLightElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}

	@Override
	public void swithToFrameByIdOrNameOrIndex(String type, String value) {
		
		 switch(type) { 
		 case "index": driver.switchTo().frame(Integer.parseInt(value));
		 case "name": driver.switchTo().frame(value);
		 case "id":driver.switchTo().frame(value); 
		 }
		 
	}
	
	@Override
	public void swithToFrameByWebelement(WebElement element) {
		 driver.switchTo().frame(element);  
	}
	
	@Override
	public void swithToDefaultContent() {
		driver.switchTo().defaultContent();
	}
	
	@Override
	public Alert swithToAlert() {
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

	@Override
	public void rightClickOnPage() {
		Actions action=new Actions(driver);
		action.contextClick().build().perform();
	}

	@Override
	public void rightClickOnElement(WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick(element).build().perform();
	}

	@Override
	public void doubleClickOnElement(WebElement element) {
		Actions action=new Actions(driver);
		action.doubleClick(element).build().perform();
	}

	@Override
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",element);	
	}

	@Override
	public String getText(WebElement element) {
		String text=element.getText();
		return text;
	}

	@Override
	public void refreshPage() {
		driver.navigate().refresh();
	}

	@Override
	public void closeBrowser() {
		driver.close();
	}

	@Override
	public void quitBrowser() {
		driver.quit();
	}
	
	
}
