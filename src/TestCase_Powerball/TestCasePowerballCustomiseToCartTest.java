package TestCase_Powerball;
/// This Test Scenario covers Test cases involved in :
//1. Adding Powerball Create your own Tickets to the cart.
//2. Navigating to the Powerball via the Play Menu in the NavBar
//3. Choose option from the dropdown and check the dependant values on the Powerball page. 
/// Test the Fast Fill and Clear all functionality
//4. Adding several Ticket combinations to the Cart keeping a count of items and total amount.
//All the Ticket Titles, Games, GameTypes and Cost are tested using the Assert functionality.
////** A database e.g. Excel sheet can be used to add combinations and test in loops.
//5. Navigate to the Checkout page via the Cart link Click and Checkout button.
//6. Use Assert functionality to test the tickets added, the total count of tickets added and
//7. Check the total amount of cart by calculating the ticket values in real time.
//8. Test the Empty cart functionality.

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
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
public class TestCasePowerballCustomiseToCartTest {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
public static void main(String args[]) {
	  JUnitCore junit = new JUnitCore();
	  junit.addListener(new TextListener(System.out));
	  Result result = junit.run(TestCasePowerballCustomiseToCartTest.class); 
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
public void testCasePowerballCustomiseToCart() {
 // Test name: TestCase_Powerball_Customise_ToCart
 // Step # | name | target | value
 // 1 | open | https://www.thelott.com/ | 
 driver.get("https://www.thelott.com/");
 // 2 | setWindowSize | 1382x886 | 
 driver.manage().window().setSize(new Dimension(1382, 886));
 // 3 | click | id=playmenu | 
 driver.findElement(By.id("playmenu")).click();
 // 4 | click | css=#powerball-tile span | 
 driver.findElement(By.cssSelector("#powerball-tile span")).click();
 // 5 | click | css=.marked-entry-title | 
 driver.findElement(By.cssSelector(".marked-entry-title")).click();
 // 6 | click | css=.content > .select > .au-target | 
 driver.findElement(By.cssSelector(".content > .select > .au-target")).click();
 // 7 | select | css=.content > .select > .au-target | label=50 Games - $60.60
 {
   WebElement dropdown = driver.findElement(By.cssSelector(".content > .select > .au-target"));
   dropdown.findElement(By.xpath("//option[. = '50 Games - $60.60']")).click();
 }
 // 8 | click | css=.buttons:nth-child(2) > .fast-select > span | 
 driver.findElement(By.cssSelector(".buttons:nth-child(2) > .fast-select > span")).click();
 // 9 | click | css=.au-target > label > .radio-place-holder | 
 driver.findElement(By.cssSelector(".au-target > label > .radio-place-holder")).click();
 // 10 | click | css=.multi-draw-select > .au-target:nth-child(1) | 
 driver.findElement(By.cssSelector(".multi-draw-select > .au-target:nth-child(1)")).click();
 // 11 | select | css=.multi-draw-select > .au-target:nth-child(1) | label=10 draws - $606.00
 {
   WebElement dropdown = driver.findElement(By.cssSelector(".multi-draw-select > .au-target:nth-child(1)"));
   dropdown.findElement(By.xpath("//option[. = '10 draws - $606.00']")).click();
 }
 // 12 | click | css=.cart-button:nth-child(1) | 
 driver.findElement(By.cssSelector(".cart-button:nth-child(1)")).click();
 // 13 | click | css=.cart-preview-menu-row > .button | 
 driver.findElement(By.cssSelector(".cart-preview-menu-row > .button")).click();
 // 14 | assertText | css=.columns:nth-child(1) > div:nth-child(1) .entry-text:nth-child(4) > span:nth-child(1) | 50 Game Standard entry
 assertThat(driver.findElement(By.cssSelector(".columns:nth-child(1) > div:nth-child(1) .entry-text:nth-child(4) > span:nth-child(1)")).getText(), is("50 Game Standard entry"));
 // 15 | verifyText | css=.columns:nth-child(1) > div:nth-child(1) .entry-price:nth-child(2) > span:nth-child(1) | $606.00
 assertThat(driver.findElement(By.cssSelector(".columns:nth-child(1) > div:nth-child(1) .entry-price:nth-child(2) > span:nth-child(1)")).getText(), is("$606.00"));
 // 16 | verifyText | css=.columns:nth-child(1) > div:nth-child(1) .draw-text:nth-child(2) | 10 Draws
 assertThat(driver.findElement(By.cssSelector(".columns:nth-child(1) > div:nth-child(1) .draw-text:nth-child(2)")).getText(), is("10 Draws"));
 // 17 | verifyText | css=.lerv-offer-details > .text | 1 Ticket subtotal
 assertThat(driver.findElement(By.cssSelector(".lerv-offer-details > .text")).getText(), is("1 Ticket subtotal"));
 // 18 | assertText | css=.purchase-summary > .amount | $606.00
 assertThat(driver.findElement(By.cssSelector(".purchase-summary > .amount")).getText(), is("$606.00"));
 // 19 | click | css=.purchase-button-container .text | 
 driver.findElement(By.cssSelector(".purchase-button-container .text")).click();
 // 20 | mouseOver | css=.loading | 
 {
   WebElement element = driver.findElement(By.cssSelector(".loading"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 // 21 | mouseOut | css=.loading | 
 {
   WebElement element = driver.findElement(By.tagName("body"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element, 0, 0).perform();
 }
 // 22 | click | css=use:nth-child(2) | 
 driver.findElement(By.cssSelector("use:nth-child(2)")).click();
 // 23 | click | linkText=Empty Cart | 
 driver.findElement(By.linkText("Empty Cart")).click();
 // 24 | click | css=.button:nth-child(2) | 
 driver.findElement(By.cssSelector(".button:nth-child(2)")).click();
}
}
