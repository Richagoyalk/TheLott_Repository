package TestCase_SatLotto;


/// This Test Scenario covers Test cases involved with 
/// CREATE YOUR OWN LOTTO TICKETS SYSTEM OPTION :
//1. Navigating to the Saturday Lotto via the Play Menu in the NavBar
//2. Selecting the SYSTEM Saturday Lotto Ticket option 
//3. Selecting multiple combinations of options from the 2 dropdowns
///NOTE: Testing can be done for all options and boundary values using a database and looping.
//4. Filling Ticket numbers one by one and by Using the FAST Fill option.
//5. FAST FILL AND CLEAR ALL BUTTONS tested in various combinations
//6. Navigate to the Checkout page via the Cart link Click
//7. Use Assert functionality to test the tickets labels total amount on Checkout page.
//8. Test the Empty Cart functionality.

//Generated by Selenium IDE

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestCaseSatLottoCustomiseSystemToCartTest {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
public static void main(String args[]) {
	  JUnitCore junit = new JUnitCore();
	  junit.addListener(new TextListener(System.out));
	  Result result = junit.run(TestCaseSatLottoCustomiseSystemToCartTest.class); 
	  if (result.getFailureCount() > 0) {
	    System.out.println("Test Failed.");
	    System.exit(1);
	  } else {
	    System.out.println("Test Passed.");
	    System.exit(0);
	  }
	}
@Before
public void setUp() {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\richa\\Downloads\\chromedriver_win32\\chromedriver.exe");
 driver = new ChromeDriver();
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}
@After
public void tearDown() {
 driver.quit();
}
@Test
public void testCaseSatLottoCustomiseSystemToCart() {
 driver.get("https://www.thelott.com//");
 driver.manage().window().setSize(new Dimension(1382, 886));
 driver.findElement(By.cssSelector(".ico-UiAngleDwn")).click();
 driver.findElement(By.cssSelector(".xsmall-collapse:nth-child(4)")).click();
 driver.findElement(By.id("playmenu")).click();
 driver.findElement(By.id("saturday-gold-lotto-tile")).click();
 driver.findElement(By.id("marked-entry-tab")).click();
 driver.findElement(By.cssSelector(".au-target > .au-target > .slider-container .au-target:nth-child(2) > .au-target:nth-child(1)")).click();
 driver.findElement(By.cssSelector(".system .select > .au-target")).click();
 {
   WebElement dropdown = driver.findElement(By.cssSelector(".system .select > .au-target"));
   dropdown.findElement(By.xpath("//option[. = 'Pick 4']")).click();
 }
 driver.findElement(By.cssSelector(".games .select > .au-target")).click();
 {
   WebElement dropdown = driver.findElement(By.cssSelector(".games .select > .au-target"));
   dropdown.findElement(By.xpath("//option[. = '50 Games - $33,917.50']")).click();
 }
 driver.findElement(By.cssSelector(".marked-entry")).click();
 driver.findElement(By.cssSelector(".buttons:nth-child(2) > .fast-select > span")).click();
 driver.findElement(By.cssSelector(".buttons:nth-child(1) > .clear > span")).click();
 driver.findElement(By.cssSelector(".buttons:nth-child(1) > .fast-select > span")).click();
 driver.findElement(By.cssSelector(".buttons:nth-child(2) > .fast-select > span")).click();
 driver.findElement(By.cssSelector(".au-target:nth-child(4) > .text:nth-child(1)")).click();
 vars.put("var", driver.findElement(By.cssSelector(".au-target:nth-child(4) > .text:nth-child(1)")).getText());
 System.out.println(vars.get("var").toString());
 driver.findElement(By.cssSelector(".ticket")).click();
 driver.findElement(By.cssSelector(".cart-button:nth-child(2)")).click();
 driver.findElement(By.cssSelector(".cart-preview-menu-row > .button")).click();
 driver.findElement(By.cssSelector(".purchase-button-container .text")).click();
 {
   WebElement element = driver.findElement(By.cssSelector(".loading"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 {
   WebElement element = driver.findElement(By.tagName("body"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element, 0, 0).perform();
 }
 driver.findElement(By.cssSelector("use:nth-child(2)")).click();
 driver.findElement(By.linkText("Empty Cart")).click();
 driver.findElement(By.cssSelector(".button:nth-child(2)")).click();
}
}
