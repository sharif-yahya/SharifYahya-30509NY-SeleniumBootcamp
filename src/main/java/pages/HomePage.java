package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.TestUtil;

public class HomePage extends TestBase {

    TestUtil testUtil;

    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault&lid=sitenav_main-logo']")
    WebElement espnLogo;

    @FindBy(xpath = "//a[@name='&lpos=LRail:espn+:logo']")
    WebElement espnPlusLogo;

    public static By soccerBtnBy = By.xpath("");

    public HomePage() {
        PageFactory.initElements(driver,this);
        testUtil = new TestUtil();
    }

    public String espnPageTitle(){
      return driver.getTitle();
    }
    public boolean espnPageLogo(){
     return espnLogo.isDisplayed();

    }
    public boolean espnPlusPageLogo(){
      return espnPlusLogo.isDisplayed();
    }

    public SoccerPage navigateToSocorPage(){
        testUtil.Actions(soccerBtnBy);

        return new SoccerPage();
    }



}
