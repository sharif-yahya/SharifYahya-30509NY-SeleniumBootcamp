package testCases;

import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EspnHomePage;
import pages.NbaPage;
import pages.SoccerPage;

public class SoccerPageTest extends TestBase {

    SoccerPage soccerPage;
    EspnHomePage homePage;

    NbaPage nbaPage;

    public SoccerPageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        soccerPage = new SoccerPage();
        homePage = new EspnHomePage();
        nbaPage = new NbaPage();


    }
    @Test(priority = 1)
    public void verifyMohamedElNeNyPageTest(){
        soccerPage.verifyMohamedElNeNyPage();
    }
    @Test(priority = 2)
    public void navigateToNbaPageTest(){
        soccerPage.navigateNbaPage();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
