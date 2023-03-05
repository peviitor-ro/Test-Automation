@Footer
Feature: Informatii Suplimentare section of the footer
  Background: You have the homepage open in any browser
    Given User is on the homepage

  Scenario: Spelling of the words Informații suplimentare
    Then the second section is spelled as "Informații suplimentare"

  Scenario: "Condiții de utilizare" spelling and redirect on click
    Then the first link text under Informatii Suplimentare is "Despre noi"