@Footer
Feature: Organizatie section of the footer and links under it

  Background: You have the homepage open in any browser
    Given User is on the homepage

  Scenario: Spelling of the word Organizație
    Then the section is spelled as "Organizație"

  Scenario: "Despre noi" spelling and redirect on click
    Then the first link text under Organizatie is "Despre noi"
    And the first link is "https://www.oportunitatisicariere.ro/"
    And on click the link opens in a new tab

  Scenario: "Alătură-te cauzei noastre" spelling and redirect
    Then the second link text under Organizatie is "Alătură-te cauzei noastre"
    And the second link is "https://www.oportunitatisicariere.ro/voluntari"
    And on click the link opens in a new tab