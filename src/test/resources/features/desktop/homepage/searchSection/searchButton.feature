@SearchButton
Feature: Search button

  Background: You have the homepage open in any browser
    Given User is on the homepage
  @SearchButton
  Scenario: Spelling of Caută button and visibility
    Given the button Caută is displayed
    Then the button Caută is spelled as "Caută"
    And Caută can be clicked and returned results without search parameter