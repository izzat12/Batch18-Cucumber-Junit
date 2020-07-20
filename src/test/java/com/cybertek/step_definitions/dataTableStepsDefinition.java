package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class dataTableStepsDefinition {

    @Given("User does something")
    public void user_does_something() {


    }


    //Some other steps were also undefined:

    @Then("User should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> CountryList) {

        System.out.println("CountryList.size() = "+CountryList.size());

    }

}
