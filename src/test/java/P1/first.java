package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;



import io.github.bonigarcia.wdm.WebDriverManager;

public class first {
	
public WebDriver driver;

@BeforeTest
@Parameters({"Browser"})
public void before(String browser)
{

	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  WebDriverManager.chromedriver().driverVersion("90.0.4430.85").setup();
			 driver = new ChromeDriver();
			// driver.get("https://www.facebook.com");
			
	  }
	  else if(browser.equalsIgnoreCase("IE"))
	  {
		  WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
	  }
	  else if(browser.equalsIgnoreCase("Firefox"))
	  {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
	  }
	  else if(browser.equalsIgnoreCase("headless"))
	  {
		  WebDriverManager.chromedriver().driverVersion("90.0.4430.85").setup();
			
		    ChromeOptions options = new ChromeOptions();
		    options.setHeadless(true);
		    driver = new ChromeDriver(options);
	  }
	  else
	  {
		  System.out.println("Oops the browser is not supported!!!");
	  }
	  
	
}

@Test
public void facebook() throws InterruptedException
 {
	

	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.id("email")).sendKeys("8857956365");
	 driver.findElement(By.id("pass")).sendKeys("chaitali@7040");
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(2000);
	 
}

@AfterTest
public void after()
{
	driver.quit();
}
}
