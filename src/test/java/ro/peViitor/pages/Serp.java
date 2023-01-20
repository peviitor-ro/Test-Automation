package ro.peViitor.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class Serp extends Landing {

    public WebElement alaturate() throws InterruptedException {
        sleep(500);
        WebElement webElement = driver.findElement(By.xpath("/html/body/div/section/section/section/section/a[2]"));
        return webElement;
    }

    public WebElement briefcase()throws InterruptedException{
        sleep(500);
        WebElement webElement = driver.findElement(By.xpath("/html/body/div/section/section/section/section/a[2]/img"));
        return webElement;
    }



    public void clickAlaturate() throws InterruptedException {
        WebElement alatura_te = alaturate();
        System.out.println(alatura_te.getLocation());
        alatura_te.click();
    }

    public String alaturateLocation() throws InterruptedException {
        return String.valueOf(alaturate().getLocation());
    }

    public String alaturateDiacristics() throws InterruptedException {
        return alaturate().getText();
    }

    public String alaturateSpacing() throws InterruptedException {
        return alaturate().getCssValue("letter-spacing");
    }

    public String alaturateColor() throws InterruptedException {
        return alaturate().getCssValue("color");
    }

    public String alaturateFont()throws InterruptedException{
        return alaturate().getCssValue("font-family");
    }

    public String alaturateWeight()throws InterruptedException{
        return alaturate().getCssValue("font-weight");
    }

    public String alaturateStyle()throws InterruptedException{
        return alaturate().getCssValue("font-style");
    }

    public String alaturateSize()throws InterruptedException{
        return alaturate().getCssValue("font-size");
    }

    public String alaturateHeight()throws InterruptedException{
        return alaturate().getCssValue("line-height");
    }

    public String alaturateWidth()throws InterruptedException{
        return alaturate().getCssValue("width");
    }

    public String alaturateButtonHeight()throws InterruptedException{
        return alaturate().getCssValue("height");
    }

    public String briefcaseDisplayed()throws InterruptedException{
        return String.valueOf(briefcase().getLocation());
    }

    public String briefcaseWidth()throws InterruptedException{
        return briefcase().getCssValue("Width");
    }

    public String briefcaseHeight()throws InterruptedException{
        return briefcase().getCssValue("Height");
    }

    public String briefcaseColor()throws InterruptedException{
        return briefcase().getCssValue("color");
    }




}
