@FooterLogo @Serp

Feature: Footer logo

  Background: You have the homepage open in any browser
    Given User is on SERP page

  @FooterLogo
  Scenario: Presence of footer logo and behaviour
    Then the logo is visible in footer section
    And on click on footer logo nothing happens