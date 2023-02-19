package ro.peviitor.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"ro.peviitor"},
        plugin = {"pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "html:target/cucumber-reports/CucumberTests.html"},
        monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests
{

}
