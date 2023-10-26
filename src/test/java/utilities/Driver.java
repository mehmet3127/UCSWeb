package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;

    private Driver() {

    }

    public static WebDriver getDriver() {

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");//Selenium 5.4.+ versiyonda sıkıntı oldugu için bu kod ile düzeltildi

        if (driver == null) {
            String browser = ConfigReader.getProperty("browser");
            if ("chrome".equals(browser)) {

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(option);

            } else if ("firefox".equals(browser)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();

            } else if ("edge".equals(browser)) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }else if ("chrome-headless".equals(browser)) {
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }

    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }

    public static void clickWithJS(WebElement element){
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click(true);", element);
    }

}
