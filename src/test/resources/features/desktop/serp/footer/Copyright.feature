@Footer
Feature: Copyright footer section content

  Background: You have the homepage open in any browser
    Given User is on SERP page
    @Copyright
    Scenario: Spelling of the copyright footer
      Then the section is spelled as "© 2023 - Toate drepturile rezervate PE VIITOR."
      And on click nothing happens