package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchpPage {

    public EtsySearchpPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(name = "search_query")
    public WebElement searchItem;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement searchButton;
}