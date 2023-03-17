package ro.peviitor.pageobject.pages;

import ro.peviitor.pageobject.BasePage;
import ro.peviitor.utils.TypesOfData;

public class SerpPage extends BasePage {

    public void open() {
        webDriver.get(TypesOfData.SERP);
    }
}
