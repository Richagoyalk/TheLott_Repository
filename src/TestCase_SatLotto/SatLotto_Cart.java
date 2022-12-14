package TestCase_SatLotto;


/// This Test Scenario covers Test cases involved in :
//1. Adding several Saturday Lotto Quick Play Tickets to the cart.
//2. Navigating to the Saturday Lotto via the Play Menu in the NavBar
//3. Checking the Ticket titles on the Saturday Lotto page.
//4. Adding several Tickets to the Cart keeping a count
//5. Navigate to the Checkout page via the Cart link Click
//6. Use Assert functionality to test the tickets added, the total count of tickets added and
//7. Check the total amount of cart by calculating the ticket values in real time.
//8. Test the Empty cart functionality.

//Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
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

public class SatLotto_Cart {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  public static void main(String args[]) {
	  JUnitCore junit = new JUnitCore();
	  junit.addListener(new TextListener(System.out));
	  Result result = junit.run(SatLotto_Cart.class); 
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
  public void test() {
    driver.get("https://www.thelott.com/");
    driver.manage().window().setSize(new Dimension(1382, 886));
    driver.findElement(By.cssSelector(".ico-UiAngleDwn")).click();
    driver.findElement(By.cssSelector(".xsmall-collapse:nth-child(4)")).click();
    driver.findElement(By.id("playmenu")).click();
    driver.findElement(By.id("saturday-gold-lotto-tile")).click();
    {
        WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
        webdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".quickpick-title")));
     }
    driver.findElement(By.cssSelector(".quickpick-title")).click();
    {
        WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
        webdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li:nth-child(1) .name > em")));
     }
    
    ///////// Check and compare the ticket titles ///////////
    
    assertEquals(driver.findElement(By.cssSelector("li:nth-child(1) .name > em")).getText(), "REGULAR");
   
    assertEquals(driver.findElement(By.cssSelector("li:nth-child(2) .name > em")).getText(), "SUPER");

    assertEquals(driver.findElement(By.cssSelector("li:nth-child(3) .name > em")).getText(), "MEGA");
   
    assertEquals(driver.findElement(By.cssSelector("li:nth-child(4) .name > em")).getText(), "JUMBO");
    
    assertEquals(driver.findElement(By.cssSelector("li:nth-child(5) .name > em")).getText(), "MAXI");

    
    driver.findElement(By.cssSelector("li:nth-child(1) .cart")).click();
    driver.findElement(By.cssSelector("li:nth-child(2) .cart")).click();
    driver.findElement(By.cssSelector("li:nth-child(3) .cart")).click();
    driver.findElement(By.cssSelector("li:nth-child(4) .cart")).click();
    driver.findElement(By.cssSelector("li:nth-child(5) .cart")).click();
    driver.findElement(By.cssSelector(".ico-DsCart > path")).click();
    
    /////Check the total tickets added and total amount in cart///////


    assertEquals(driver.findElement(By.cssSelector(".lerv-offer-details > .text")).getText(), "5 Tickets subtotal");
    assertEquals(Integer.valueOf(driver.findElement(By.cssSelector(".purchase-summary > .amount")).getText().replace("$","")), is(Integer.valueOf(driver.findElement(By.cssSelector("li:nth-child(1) .cost > em")).getText().replace("$",""))+Integer.valueOf(driver.findElement(By.cssSelector("li:nth-child(2) .cost > em")).getText().replace("$",""))+Integer.valueOf(driver.findElement(By.cssSelector("li:nth-child(3) .cost > em")).getText().replace("$",""))+Integer.valueOf(driver.findElement(By.cssSelector("li:nth-child(4) .cost > em")).getText().replace("$",""))+Integer.valueOf(driver.findElement(By.cssSelector("li:nth-child(5) .cost > em")).getText().replace("$",""))));
    driver.findElement(By.cssSelector(".purchase-button-container .text")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector("use:nth-child(2)")).click();
    driver.findElement(By.linkText("Empty Cart")).click();
    driver.findElement(By.cssSelector(".button:nth-child(2)")).click();
  }
}
