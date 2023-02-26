package ro.peviitor.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"ro.peviitor"},
        plugin = {"pretty",
                "html:target/cucumber-reports/CucumberTests.html"},
        monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests
{

}
