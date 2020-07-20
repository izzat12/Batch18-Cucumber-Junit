
Feature: Wiki title and search verifications

   Background: User is on the Wiki home page
     Given User is on the Wikipedia home page


     Scenario: Search functionality
       When User searches "Steve Jobs" in the wiki search page
       Then User should see "HAHAHAHAH" in the wiki title

       @wiki
  Scenario Outline: Search functionality header verification
    When User searches "<searchValues>" in the wiki search page
    Then User should see "<expectedTitle>" in the wiki title
    Then User should see "<expectedMainHeader>" in the main header
    Then User sees "<expectedImageHeader>" is in the image header

    Examples: example test data for wiki search

    |searchValues|expectedTitle|expectedMainHeader|expectedImageHeader|
    | Steve Jobs | Steve Jobs  | Steve Jobs       | Steve Jobs        |
    | John Cena  | John Cena   | Jsdfsdf        | Joasdasd       |
    | Uzbekistan | Uzbekistan  | Uzbesdasdasdaskistan       | Republic of Uzbekistan|
    |Donald Trump|Donald Trump |Donald Trump      |Donald Trump       |
    | Bill Gates | Bill Gates  |  Bill Gates      | Bill Gates        |



