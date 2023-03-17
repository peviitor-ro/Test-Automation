@Footer @Serp
Feature: Informatii suplimentare section of the footer and links underneath

  Background: You have the homepage open in any browser
    Given User is on SERP page

  @InformatiiSuplimentare
  Scenario: Spelling of the word Informații suplimentare
    Then the second section is spelled as "Informații suplimentare"

  @InformatiiSuplimentare
  Scenario: "Condiții de utilizare" spelling and redirect on click
    Then the first link text in second section  under Informatii suplimentare is "Condiții de utilizare"
    And the first link in second section is "https://legal.peviitor.ro/"
    And on click the link opens in a new tab

  @InformatiiSuplimentare
  Scenario: "Politica de confidențialitatee" spelling and redirect
    Then the second link text in second section under Informatii suplimentare is "Politica de confidențialitate"
    And the second link in second section is "https://legal.peviitor.ro/confidentialitate"
    And on second click the link opens in a new tab