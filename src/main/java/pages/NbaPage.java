package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.TestUtil;

public class NbaPage extends TestBase {
    TestUtil testUtil;

    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+sitenav_nba']")
    WebElement nbaPageBtn;

    public static By nbaTeamPage = By.xpath( "//a[@name='&lpos=subnav+subnav_nba_teams']");


    @FindBy(xpath = "//a[@name='&lpos=subnav+subnav_nba_brooklyn_nets']")
    WebElement brooklynNetPage;

    @FindBy(xpath = "//span[contains(text(),'Stats')]")
    WebElement brooklynNetStats;

    @FindBy(xpath = "(//tr[@data-idx='1'])[1]")
    WebElement kyrieIrvingPage;

    @FindBy(xpath = "//div[@class='Image__Wrapper Image__Wrapper--relative']//img[@alt='Kyrie Irving']")
    WebElement kyrieImg;

    @FindBy(xpath = "//div[contains(text(),'Full Splits')]")
    WebElement kyrieIrvingStats;

    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault&lid=sitenav_main-logo']")
    WebElement espnHomePage;

    public NbaPage(){
        PageFactory.initElements(driver,this);
        testUtil = new TestUtil();

    }


    public void verifyKyrieIrvingStatus( )throws NoSuchWindowException {
        try {
            nbaPageBtn.click();
        }catch (NoSuchWindowException e){
            e.printStackTrace();
        }catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        testUtil.Actions(nbaTeamPage);
        brooklynNetPage.click();
        brooklynNetStats.click();
        kyrieIrvingPage.click();
        kyrieImg.isDisplayed();
        kyrieIrvingStats.click();

    }

    public EspnHomePage navigateToHomePage(){
        espnHomePage.click();
        return new EspnHomePage();

    }
}
