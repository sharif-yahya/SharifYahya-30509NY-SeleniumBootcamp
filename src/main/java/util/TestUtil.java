package util;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TestUtil extends TestBase {


public void Actions(By byElelemnt){
    Actions action = new Actions(driver);
    action.moveToElement(driver.findElement(byElelemnt)).build().perform();
}

}



