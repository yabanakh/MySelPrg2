package com.itexpt.seltest.test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver=DriverUtls.getChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://www.google.com/search?q=mercury+tours&oq=mercury+tours&aqs=chrome..69i57j0l4j69i60l3.11793j0j7&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/a/h3")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("mercury");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("mercury");
    driver.findElement(By.name("login")).click();
    driver.findElement(By.name("passCount")).click();
    new Select(driver.findElement(By.name("passCount"))).selectByVisibleText("2");
    driver.findElement(By.name("passCount")).click();
    driver.findElement(By.name("fromPort")).click();
    new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("New York");
    driver.findElement(By.name("fromPort")).click();
    driver.findElement(By.name("fromMonth")).click();
    new Select(driver.findElement(By.name("fromMonth"))).selectByVisibleText("April");
    driver.findElement(By.name("fromMonth")).click();
    driver.findElement(By.name("fromDay")).click();
    new Select(driver.findElement(By.name("fromDay"))).selectByVisibleText("5");
    driver.findElement(By.name("fromDay")).click();
    driver.findElement(By.name("toPort")).click();
    new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Portland");
    driver.findElement(By.name("toPort")).click();
    driver.findElement(By.name("toMonth")).click();
    new Select(driver.findElement(By.name("toMonth"))).selectByVisibleText("July");
    driver.findElement(By.name("toMonth")).click();
    driver.findElement(By.name("toDay")).click();
    new Select(driver.findElement(By.name("toDay"))).selectByVisibleText("13");
    driver.findElement(By.name("toDay")).click();
    driver.findElement(By.xpath("(//input[@name='servClass'])[2]")).click();
    driver.findElement(By.name("airline")).click();
    new Select(driver.findElement(By.name("airline"))).selectByVisibleText("Unified Airlines");
    driver.findElement(By.name("airline")).click();
    driver.findElement(By.name("findFlights")).click();
    driver.findElement(By.xpath("(//input[@name='outFlight'])[2]")).click();
    driver.findElement(By.xpath("(//input[@name='inFlight'])[4]")).click();
    driver.findElement(By.name("reserveFlights")).click();
    driver.findElement(By.name("passFirst0")).click();
    driver.findElement(By.name("passFirst0")).clear();
    driver.findElement(By.name("passFirst0")).sendKeys("Bob");
    driver.findElement(By.name("passLast0")).clear();
    driver.findElement(By.name("passLast0")).sendKeys("Fisher");
    driver.findElement(By.name("pass.0.meal")).click();
    new Select(driver.findElement(By.name("pass.0.meal"))).selectByVisibleText("Diabetic");
    driver.findElement(By.name("pass.0.meal")).click();
    driver.findElement(By.name("passFirst1")).click();
    driver.findElement(By.name("passFirst1")).clear();
    driver.findElement(By.name("passFirst1")).sendKeys("Kate");
    driver.findElement(By.name("passLast1")).click();
    driver.findElement(By.name("passLast1")).clear();
    driver.findElement(By.name("passLast1")).sendKeys("Fisher");
    driver.findElement(By.name("pass.1.meal")).click();
    new Select(driver.findElement(By.name("pass.1.meal"))).selectByVisibleText("Kosher");
    driver.findElement(By.name("pass.1.meal")).click();
    driver.findElement(By.name("creditnumber")).click();
    driver.findElement(By.name("creditnumber")).clear();
    driver.findElement(By.name("creditnumber")).sendKeys("5555222287961452");
    driver.findElement(By.name("cc_exp_dt_mn")).click();
    new Select(driver.findElement(By.name("cc_exp_dt_mn"))).selectByVisibleText("11");
    driver.findElement(By.name("cc_exp_dt_mn")).click();
    driver.findElement(By.name("cc_exp_dt_yr")).click();
    new Select(driver.findElement(By.name("cc_exp_dt_yr"))).selectByVisibleText("2010");
    driver.findElement(By.name("cc_exp_dt_yr")).click();
    driver.findElement(By.name("cc_frst_name")).click();
    driver.findElement(By.name("cc_frst_name")).clear();
    driver.findElement(By.name("cc_frst_name")).sendKeys("Bob");
    driver.findElement(By.name("cc_last_name")).clear();
    driver.findElement(By.name("cc_last_name")).sendKeys("Fisher");
    driver.findElement(By.xpath("//tr")).click();
    driver.findElement(By.name("billAddress1")).clear();
    driver.findElement(By.name("billAddress1")).sendKeys("123");
    driver.findElement(By.name("billAddress1")).click();
    driver.findElement(By.name("billAddress1")).clear();
    driver.findElement(By.name("billAddress1")).sendKeys("123 Chicago");
    driver.findElement(By.xpath("//tr[12]")).click();
    driver.findElement(By.name("billAddress1")).click();
    driver.findElement(By.name("billAddress1")).clear();
    driver.findElement(By.name("billAddress1")).sendKeys("123 Chicago Ave");
    driver.findElement(By.xpath("//tr")).click();
    driver.findElement(By.name("billCity")).clear();
    driver.findElement(By.name("billCity")).sendKeys("Chicago");
    driver.findElement(By.xpath("//tr[13]")).click();
    driver.findElement(By.name("billState")).clear();
    driver.findElement(By.name("billState")).sendKeys("IL");
    driver.findElement(By.name("billZip")).clear();
    driver.findElement(By.name("billZip")).sendKeys("60089");
    driver.findElement(By.xpath("(//input[@name='ticketLess'])[2]")).click();
    driver.findElement(By.name("buyFlights")).click();
  }

  @After
  public void tearDown() throws Exception {
    //driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
