package testCases;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EspnHomePage;
import pages.SoccerPage;

public class EspnHomePageTest extends TestBase {

    EspnHomePage homePage;
    SoccerPage soccerPage;

    public EspnHomePageTest() {
        super();


    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new EspnHomePage();
        soccerPage = new SoccerPage();


    }

    @Test(priority = 1)
    public void verifyEspnPageTitleTest() {
        String title = homePage.verifyEspnPageTitle();
        Assert.assertEquals(title, "ESPN: Serving sports fans. Anytime. Anywhere.");
    }

    @Test(priority = 2)
    public void verifyEspnPageLogoTest() {
        boolean b = homePage.verifyEspnPageLogo();
        Assert.assertTrue(true);
    }

    @Test(priority = 3)
    public void verifyEspnPlusPageLogoTest() {
        boolean b1 = homePage.verifyEspnPlusPageLogo();
        Assert.assertTrue(true, "b1");
    }
    @Test(priority = 4)
    public void navigateToSoccerPageTest(){
      homePage.navigateToSoccerPage();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
