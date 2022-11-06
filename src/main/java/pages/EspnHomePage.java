package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.TestUtil;

public class EspnHomePage extends TestBase {

    TestUtil testUtil;
    SoccerPage soccerPage;

    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault&lid=sitenav_main-logo']")
    WebElement espnLogo;

    @FindBy(xpath = "//a[@name='&lpos=LRail:espn+:logo']")
    WebElement espnPlusLogo;

   @FindBy( xpath = "//a[@name='&lpos=sitenavdefault+sitenav_soccer']")
    WebElement navigateToSoccerPage;

    public EspnHomePage() {
        PageFactory.initElements(driver,this);
        testUtil = new TestUtil();
        soccerPage = new SoccerPage();

    }

    public String verifyEspnPageTitle(){
      return driver.getTitle();
    }
    public boolean verifyEspnPageLogo(){
     return espnLogo.isDisplayed();

    }
    public boolean verifyEspnPlusPageLogo(){
      return espnPlusLogo.isDisplayed();
    }

    public SoccerPage navigateToSoccerPage(){
      navigateToSoccerPage.click();
        return new SoccerPage();
    }


}
