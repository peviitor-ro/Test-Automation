package ro.peviitor.steps;

import io.cucumber.java.en.Given;

import ro.peviitor.pageobject.pages.SerpPage;

public class SerpPageSteps {

    private final SerpPage serpPage = new SerpPage();

    @Given("User is on SERP page")
    public void userIsOnSERPPage() {
        serpPage.open();
    }
}
