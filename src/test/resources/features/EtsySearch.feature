@EtsyAll
Feature: Etsy search feature
     Agile story: User should be able to enter search terms and see relevant
     results in the page and in the title.

  Background: User is on the etsy home page
    Given User is on the etsy home page


  Scenario: Title verification
    Then User should see title is as expected

    Scenario: Title verification after search
    When User types "apple" in the search box
      And User clicks to search button
      Then User sees "Apple" is in the Etsy title