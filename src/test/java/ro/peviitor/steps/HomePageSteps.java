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

    @Then("the homepage title is {string}")
    public void theHomepageTitleIs(String pageTitle)
    {
        assertEquals(homePage.getPageTitle(), pageTitle, "The title of the page is incorrect.");
    }
}
