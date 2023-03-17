@Header
Feature: Header section content

  Background: You have the homepage open in any browser
    Given User is on SERP page

  @Header
  Scenario: Briefcase  header content
    Then Briefcase logo visible

  @Header
  Scenario: Alătură-te spelling , link and redirect on click
    Then Alătură-te text displayed
    Then Spelling of the word  is "Alătură-te"
    And the link of Alătură-te is "https://www.oportunitatisicariere.ro/voluntari"
    And clicking on Alătură-te opens a new tab