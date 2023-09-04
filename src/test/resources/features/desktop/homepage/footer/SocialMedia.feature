@Footer
Feature: Social media footer section content and link underneath

  Background: You have the homepage open in any browser
    Given User is on the homepage

  @SocialMedia
  Scenario: Spelling of the word Social Media
    Then the name is spelled as ""

  @SocialMedia
  Scenario: First link under Social media and redirect on click
    Then the first link underneath Social Media is "https://www.linkedin.com/company/asociatia-oportunitati-si-cariere/"
    And on click first link from Social Media opens in a new tab

  @SocialMedia
  Scenario:Second link under Social media and redirect on click
    Then the second link underneath Social Media is "https://discord.gg/t2aEdmR52a"
    And on click second link from Social Media opens in a new tab


