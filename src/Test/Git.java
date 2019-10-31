package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Git {
	public WebDriver driver;
	public Actions action;
	public static void main(String[] args) throws Exception {
		
		  System.setProperty("webdriver.chrome.driver","F:\\workspace\\chromedriver_win32 (2)\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.spicejet.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  Actions a =new Actions(driver);
		 // WebElement element = driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"));
		  //a.moveToElement(element).build().perform();
		 WebElement s =  driver.findElement(By.id("ctl00_HyperLinkLogin"));
		 a.moveToElement(s).build().perform();
	 
		
	}

}
