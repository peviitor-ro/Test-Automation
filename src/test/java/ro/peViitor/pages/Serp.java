package ro.peViitor.pages;

import org.openqa.selenium.By;

public class Serp extends Landing{

    public void clickAlaturate(){
        driver.findElement(By.xpath("/html/body/div/section/section/section/section/a[2]")).click();
    }
}
