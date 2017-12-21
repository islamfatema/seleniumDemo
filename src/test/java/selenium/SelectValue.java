package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectValue {
@Test
public void selectFromDD() {
	System.setProperty("webdriver.gecko.driver", "/Users/fatemaislam/Downloads/geckodriver");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement element=driver.findElement(By.id("month"));
	Select month_DD=new Select(element);
	month_DD.selectByIndex(3);
	month_DD.selectByValue("10");
	month_DD.selectByVisibleText("Dec");
}
}
