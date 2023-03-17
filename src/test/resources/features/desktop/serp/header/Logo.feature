@Logo
Feature: Left header section containing Logo

  Background: You have the homepage open in any browser
    Given User is on SERP page

  @Logo
  Scenario: Logo content visible
    Then logo is visible
    And logo is displayed in left corner of the header at "(40, 30)"
    And click on logo user is redirected to HOMEPAGE