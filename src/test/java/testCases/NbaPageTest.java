package testCases;

import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NbaPage;

public class NbaPageTest extends TestBase {
    NbaPage nbaPage;

 public NbaPageTest(){
     super();

    }
    @BeforeMethod
    public void setUp(){
     initialization();
     nbaPage = new NbaPage();
    }
    @Test(priority = 1)
    public void verifyKyrieIrvingStatusTest(){
     nbaPage.verifyKyrieIrvingStatus();
    }
    @Test(priority = 2)
    public void navigateToHomePage(){
     nbaPage.navigateToHomePage();
    }
    @AfterMethod
    public void tearDown(){
     driver.quit();
    }


}
