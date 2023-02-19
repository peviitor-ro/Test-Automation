package ro.peviitor.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ro.peviitor.drivermanager.DriverManager;

public class ScreenshotHook
{
    @After(order = 2)
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.log(DriverManager.getDriver().getCurrentUrl());
            byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }
}
