package testCases;

import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SoccerPage;

public class SoccerPageTest extends TestBase {

    SoccerPage soccerPage;
    HomePage homePage;

    public SoccerPageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        soccerPage = new SoccerPage();
        homePage = new HomePage();

    }
    @Test
    public void soccerPageTest(){
        soccerPage.soccerPage();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
