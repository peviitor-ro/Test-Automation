@SearchBars
Feature: Search bars section

  Background: You have the homepage open in any browser
    Given User is on the homepage

  @SearchBars @FirstSearchBar
  Scenario: First search bar behaviour and functionality
    Then a magnifying glass is visible
    And click on magnifying glass nothing happens
    Then the spelling of the text inside first search bar is "Ce doriți să lucrați?"
    And user can type any job in the search bar like "Engineer"
    And user can search by company name like "Epam"
    When user press ENTER after filling desired search parameters returns result

  @SearchBars @SecondSearch
  Scenario: Second search criteria behaviour and functionality
    Then a location icon is visible
    Then the text inside second search criteria is by default România
    And the spelling of the text is "România"

  @SearchBars
  Scenario: Dropdown  multi select option
    When clicking on the text from second search a dropdown appear
    Then  you can select first option from dropdown "România"
    Then you can select second option from dropdown "Toate"





