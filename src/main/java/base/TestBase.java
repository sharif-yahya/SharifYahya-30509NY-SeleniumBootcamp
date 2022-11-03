package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static Properties prop;

    public static WebDriver driver;

    public TestBase() {

        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("/Users/sharifyahya/ESPN/src/main/java/config/Config/Config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("deprecation")
    public static void initialization() {
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")) {
       System.setProperty("webdriver.chrome.driver","/Users/sharifyahya/ESPN/chromedriver2");
       driver = new ChromeDriver();


        }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

            driver.get(prop.getProperty("url"));


    }

}


