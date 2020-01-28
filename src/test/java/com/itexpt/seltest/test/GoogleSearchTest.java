/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexpt.seltest.test;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author yaban
 */
public class GoogleSearchTest {
    WebDriver driver;
    
    public GoogleSearchTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        driver=DriverUtls.getChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    
    @After
    public void tearDown() {
       // driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     /*@Test
     public void testSearch() {
         driver.get("http://www.google.com");
         WebElement e=driver.findElement(By.name("q"));
         e.sendKeys("selenium jobs");
         e=driver.findElement(By.name("btnK"));
         e.click();
         String title=driver.getTitle();
         assertTrue(title.contains("selenium jobs"));
     }
     @Test
     public void testNavigation(){
         Navigation n=driver.navigate();
         n.to("http://www.itexps.net");
         n.to("http://www.google.com");
         n.to("http://wwww.facebook.com");
         n.back();
         n.forward();
         n.refresh();
         
     }
     @Test
     public void testFacebookSignip(){
           driver.get("http://wwww.facebook.com");
           driver.findElement(By.id("u_0_f")).sendKeys("Yaroslav");
           driver.findElement(By.name("lastname")).sendKeys("Banakh");
           driver.findElement(By.id("u_0_k")).sendKeys("yb@gmail.com");
           driver.findElement(By.id("u_0_p")).sendKeys("qwe123");
           //driver.findElement(By.name("birthday_month")).sendKeys("Oct");
           driver.findElement(By.name("birthday_day")).sendKeys("6");
           driver.findElement(By.name("birthday_year")).sendKeys("1994");
           //driver.findElement(By.id("u_0_a")).click();
           driver.findElements(By.name("sex")).get(1).click();
           driver.findElement(By.id("u_0_w")).click();
           new Select(driver.findElement(By.name("birthday_month"))).selectByIndex(3);
           if(!driver.findElements(By.name("sex")).get(1).isSelected())
                driver.findElements(By.name("sex")).get(1).click();
                
     }*/
     
     @Test
     public void testTicketOnline(){
           driver.get("http://newtours.demoaut.com/mercurywelcome.php");
           driver.findElement(By.name("userName")).sendKeys("mercury");
           driver.findElement(By.name("password")).sendKeys("mercury");
           driver.findElement(By.name("login")).click();
           if(!driver.findElements(By.name("tripType")).get(1).isSelected())
                driver.findElements(By.name("tripType")).get(1).click();
            driver.findElement(By.name("passCount")).sendKeys("2");
            driver.findElement(By.name("fromPort")).sendKeys("New York");
            driver.findElement(By.name("fromMonth")).sendKeys("March");
            driver.findElement(By.name("fromDay")).sendKeys("20");
            driver.findElement(By.name("toPort")).sendKeys("London");
            driver.findElement(By.name("toMonth")).sendKeys("June");
            driver.findElement(By.name("toDay")).sendKeys("6");
           
           
           
           
            
     
     }
}
