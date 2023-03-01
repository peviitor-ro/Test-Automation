package ro.peviitor.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ro.peviitor.pageobject.pages.HomePage;

import static org.testng.Assert.assertEquals;

public class HomePageSteps
{
    private final HomePage homePage = new HomePage();

    @Given("User has homepage open")
    public void userHasHomepageOpen()
    {
        homePage.open();
    }

}
