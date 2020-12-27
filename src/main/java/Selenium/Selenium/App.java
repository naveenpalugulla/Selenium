package Selenium.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public void main() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(10000);
        driver.quit();
    }
}
