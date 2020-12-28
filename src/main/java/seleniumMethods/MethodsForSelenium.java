package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
	
}
