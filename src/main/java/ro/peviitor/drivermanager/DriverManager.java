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
    private static String[] driverOptions = {};

    public static void setupDriver()
    {
        setDriverOptions();
        WebDriver webDriver = createDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT);
        webDriverThreadLocal.set(webDriver);
    }
    private static void setDriverOptions() {
        if (ConfigUtil.getTestMode().equals("true")) {
            driverOptions = ConfigUtil.getDriverOptions().split("\\s+");
        }
    }

    private static WebDriver createDriver() {
        switch (ConfigUtil.getBrowser()) {
            case "chrome": {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver(new ChromeOptions().addArguments(driverOptions));
            }
            case "edge": {
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver(new EdgeOptions().addArguments(driverOptions));
            }
            case "firefox": {
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver(new FirefoxOptions().addArguments(driverOptions));
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
