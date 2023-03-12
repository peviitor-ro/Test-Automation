@WantedJob
Feature: Find wanted job section content

  Background: You have the homepage open in any browser
    Given User is on the homepage

  @WantedJob
  Scenario: Spelling of Găsește-ți jobul dorit acum
    Then the content of wanted job section is spelled as "Găsește-ți jobul dorit acum"
    And  The color for jobul dorit from the Gaseste-ti jobul dorit acum is "rgba(224, 141, 34, 1)"

    Scenario: Spelling of Avem x de oportunitati in acest moment in Romania
      Then the second line from this section is spelled as "de oportunități în acest moment în România"