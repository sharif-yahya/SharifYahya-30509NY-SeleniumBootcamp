package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;
import util.TestUtil;

public class SoccerPage extends TestBase {


    TestUtil testUtil;

    public static By soccerBy = By.xpath(  "//a[@name='&lpos=sitenavdefault+sitenav_soccer']");
  //  WebElement soccerBtn;

    @FindBy(xpath = "//a[@name='&lpos=subnav+subnav__team_premier_league']")
    WebElement premierLeaguePage;

   public static By soccer2 =By.xpath( "//a[@name='&lpos=subnav+subnav_soccer_teams']");
   // WebElement teamPage;

    @FindBy(xpath = "//a[@name='&lpos=subnav+subnav_soccer_arsenal']")
    WebElement arsenalPage;

    @FindBy(xpath = "//span[contains(text(),'Squad')]")
    WebElement squadArsenalPage;

    @FindBy(xpath = "//a[contains(text(),'Mohamed Elneny')]")
    WebElement mohamedElnenyPage;

    @FindBy(xpath = "//body[@class='index desktop page-context-top prod']")
    WebElement nbaPage;




    public SoccerPage() {

        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);
        PageFactory.initElements(driver, this);
        testUtil = new TestUtil();

    }

    public void verifyMohamedElNeNyPage() {

      /*  Actions action = new Actions(driver);

        action.moveToElement(soccerBtn).build().perform();*/

        testUtil.Actions(soccerBy);

        premierLeaguePage.click();

       testUtil.Actions(soccer2);

        arsenalPage.click();

        squadArsenalPage.click();

        mohamedElnenyPage.click();


    }

    public NbaPage navigateNbaPage(){
        nbaPage.click();
        return new NbaPage();
    }




}
