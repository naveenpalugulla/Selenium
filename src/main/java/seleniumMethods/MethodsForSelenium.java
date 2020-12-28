package seleniumMethods;

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
public class MethodsForSelenium implements InterfaceForSeleniumMethods{
	WebDriver driver;
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

	public void initiateApplication(String browserName) {
		driver.get(browserName);
	}
	
	public void click(WebElement element){
		element.click();
	}
	
	public void sendKeys(WebElement element,String text){
		element.sendKeys(text);
	}
	
	public boolean isSelected(WebElement element){
		boolean b=element.isSelected();
		return b;
	}
	
	public boolean isEnabled(WebElement element){
		boolean b=element.isEnabled();
		return b;
	}
	
	public boolean isDisplayed(WebElement element){
		boolean b=element.isDisplayed();
		return b;
	}
	
	public String getAttributeValue(WebElement element,String attributeName){
		String attributeValue=element.getAttribute(attributeName);
		return attributeValue;
	}

	public void selectDropdownOption(WebElement element, String type, String value) {
		
		Select dropdown=new Select(element);
		/*switch(type)
		{
		case "index":
			dropdown.selectByIndex(Integer.parseInt(value));
		case "value":
			dropdown.selectByValue(value);
		case "visibletext":
			dropdown.selectByVisibleText(value);
		}*/
		
	}
	
}
