package ro.peviitor.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import ro.peviitor.drivermanager.DriverManager;

public class WebDriverHook
{
    @Before(order = 1)
    public void setupDriver() {
        DriverManager.setupDriver();
    }

    @After(order = 1)
    public void quitDriver() {
        DriverManager.quitDriver();
    }
}
