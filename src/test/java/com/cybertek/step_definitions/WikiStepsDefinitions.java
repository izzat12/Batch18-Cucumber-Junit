package com.cybertek.step_definitions;

import com.cybertek.pages.WikiPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiStepsDefinitions {

    WikiPage wikiPage = new WikiPage();

    @Given("User is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_homeapge() {

        Driver.getDriver().get("https://www.wikipedia.org/");

    }


    //Some other steps were also undefined:

    @When("User searches {string} in the wiki search page")
    public void user_searches_in_the_wiki_search_page(String string) {

        wikiPage.searchBox.sendKeys(string + Keys.ENTER);

    }


    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String value) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(value));

    }


    @Then("User should see {string} in the main header")
    public void userShouldSeeInTheMainHeader(String expected) {
        String actaulHeader = wikiPage.mainHeader.getText();
        Assert.assertEquals(actaulHeader,expected);
    }

    @Then("User sees {string} is in the image header")
    public void userSeesSteveJobsIsInTheImageHeader(String nameValue) {

        String actaulHeader = wikiPage.imageHeader.getText();

        Assert.assertEquals(actaulHeader,nameValue);
    }
}
