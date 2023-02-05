package ro.peviitor.drivermanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import ro.peviitor.utils.ConfigUtil;

import java.time.Duration;
import java.util.Optional;

public class DriverManager
{
    private static final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
    private static final Duration PAGE_LOAD_TIMEOUT = Duration.ofSeconds(30);
    private static final String HEADLESS = "headless";
    private static final String WINDOW_SIZE = "--window-size=1920,1080";

    public static void setupDriver()
    {
        WebDriver webDriver = createBrowser();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT);
        webDriverThreadLocal.set(webDriver);
    }

    private static WebDriver createBrowser()
    {
        switch (ConfigUtil.getBrowser())
        {
            case "chrome":
            {
                WebDriverManager.chromedriver().setup();
                if (ConfigUtil.getTestMode().equals("true"))
                {
                    ChromeOptions options = new ChromeOptions()
                            .addArguments(HEADLESS)
                            .addArguments(WINDOW_SIZE);
                    return new ChromeDriver(options);
                }
                return new ChromeDriver();
            }
            case "edge":
            {
                WebDriverManager.edgedriver().setup();
                if (ConfigUtil.getTestMode().equals("true"))
                {
                    EdgeOptions options = new EdgeOptions()
                            .addArguments(HEADLESS)
                            .addArguments(WINDOW_SIZE);
                    return new EdgeDriver(options);
                }
                return new EdgeDriver();
            }
            case "firefox":
            {
                WebDriverManager.firefoxdriver().setup();
                if (ConfigUtil.getTestMode().equals("true"))
                {
                    FirefoxOptions options = new FirefoxOptions()
                            .addArguments(HEADLESS)
                            .addArguments(WINDOW_SIZE);
                    return new FirefoxDriver(options);
                }
                return new FirefoxDriver();
            }
            default:
                throw new IllegalArgumentException("No appropriate driver was specified");
        }
    }

    public static WebDriver getDriver()
    {
        return webDriverThreadLocal.get();
    }

    public static void quitDriver()
    {
        Optional.ofNullable(getDriver()).ifPresent(WebDriver::quit);
        webDriverThreadLocal.remove();
    }
}
