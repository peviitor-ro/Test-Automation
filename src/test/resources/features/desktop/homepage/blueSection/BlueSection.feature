@BlueSection
Feature: Blue Section and the link underneath

  Background: You have the homepage open in any browser
    Given User is on the homepage

  @BlueSection
  Scenario: Spelling of the first line in blue section
    Then phrase is spelled as "Dorești să ajuți alți oameni?"
    And the background color of Blue section is "rgba(3, 34, 57, 1)"

  @BlueSection
  Scenario: Alătură-te cauzei noastre si devino un contribuitor spelling(2nd line in blue Section)
    Then the first text in blue section is spelled as "Alătură-te cauzei noastre si devino un contribuitor."

  @BlueSection
  Scenario: Alătură-te cauzei noastre spelling and redirect(3rd line in blue section)
    Then the third line text is "Alătură-te cauzei noastre"
    And the third line link text is "https://www.oportunitatisicariere.ro/voluntari"
    And on click the link from blue section opens a new tab
