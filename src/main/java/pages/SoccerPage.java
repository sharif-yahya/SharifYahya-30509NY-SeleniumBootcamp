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

public class SoccerPage extends TestBase {


    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+sitenav_soccer']")
    WebElement soccerBtn;

    @FindBy(xpath = "//a[@name='&lpos=subnav+subnav__team_premier_league']")
    WebElement premierLeaguePage;

    @FindBy(xpath = "//a[@name='&lpos=subnav+subnav_soccer_teams']")
    WebElement teamPage;

    @FindBy(xpath = "//a[@name='&lpos=subnav+subnav_soccer_arsenal']")
    WebElement arsenalPage;

    @FindBy(xpath = "//span[contains(text(),'Squad')]")
    WebElement squadArsenalPage;

    @FindBy(xpath = "//a[contains(text(),'Mohamed Elneny')]")
    WebElement mohamedElnenyPage;




    public SoccerPage() {

        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);
        PageFactory.initElements(driver, this);
    }

    public HomePage soccerPage() {

        Actions action = new Actions(driver);

        action.moveToElement(soccerBtn).build().perform();

        premierLeaguePage.click();

        action.moveToElement(teamPage).build().perform();

        arsenalPage.click();

        squadArsenalPage.click();

        mohamedElnenyPage.click();

        driver.get(prop.getProperty("url"));

        return new HomePage();


    }


}
