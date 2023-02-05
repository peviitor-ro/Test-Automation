package ro.peviitor;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ro.peviitor.drivermanager.DriverManager;

public class BaseTest
{
    protected WebDriver webDriver;

    @BeforeClass()
    public void setupDriver()
    {
        DriverManager.setupDriver();
    }

    @AfterClass()
    public void quitDriver()
    {
        DriverManager.quitDriver();
    }
}
