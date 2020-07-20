package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchpPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepsDefinitions {

     EtsySearchpPage etsySearchpPage = new EtsySearchpPage();

    @Given("User is on the etsy home page")
    public void user_is_on_the_etsy_home_page() {

        Driver.getDriver().get("https://www.etsy.com");

    }


    //Some other steps were also undefined:

    @Then("User should see title is as expected")
    public void user_should_see_title_is_as_expected() {

        String actaulTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(actaulTitle,expectedTitle);


    }


    @When("User types {string} in the search box")
    public void userTypesWoodenSpoonInTheSearchBox(String typeValue) {

        etsySearchpPage.searchItem.sendKeys("apple");
    }

    @And("User clicks to search button")
    public void userClicksToSearchButton() {

        etsySearchpPage.searchButton.click();

    }

    @Then("User sees {string} is in the Etsy title")
    public void userSeesIsInTheEtsyTitle(String verifySearch) {

        String actaulTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actaulTitle.contains(verifySearch));
    }
}
