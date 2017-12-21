package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PopUp {
      @Test
       public void testPopUp() throws InterruptedException {
    	  System.setProperty("webdriver.gecko.driver", "/Users/fatemaislam/Downloads/geckodriver");
    	  WebDriver driver=new FirefoxDriver();
    	  driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
    	  driver.manage().window().maximize();
    	  driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
    	  Alert alert= driver.switchTo().alert();
    	  
    	  alert.accept();
    	  Thread.sleep(3000);
    	  driver.close();
	 
 }
}
