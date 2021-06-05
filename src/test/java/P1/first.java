package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class first {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().driverVersion("90.0.4430.85").setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.id("email")).sendKeys("8857956365");
	 driver.findElement(By.id("pass")).sendKeys("chaitali@7040");
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(2000);
	 
}
}
