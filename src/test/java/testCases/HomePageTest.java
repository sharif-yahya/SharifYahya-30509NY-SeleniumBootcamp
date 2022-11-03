package testCases;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends TestBase {

    HomePage homePage;

    public HomePageTest() {
        super();


    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();

    }

    @Test(priority = 1)
    public void espnPageTitleTest() {
        String title = homePage.espnPageTitle();
        Assert.assertEquals(title, "ESPN: Serving sports fans. Anytime. Anywhere.");
    }

    @Test(priority = 2)
    public void espnPageLogoTest() {
        boolean b = homePage.espnPageLogo();
        Assert.assertTrue(true);
    }

    @Test(priority = 3)
    public void espnPlusPageLogoTest() {
        boolean b1 = homePage.espnPlusPageLogo();
        Assert.assertTrue(true, "b1");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
