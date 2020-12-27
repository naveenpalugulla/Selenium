package Selenium.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.quit();
        
        WebDriverManager.firefoxdriver().setup();
        
        FirefoxDriver driver1=new FirefoxDriver();
        driver1.get("https://www.facebook.com");
        driver1.manage().window().maximize();
        Thread.sleep(10000);
        driver1.quit();
    }
}
