@LoadMore
Feature: Încarcă mai multe button presence,spelling,behaviour

  Background: You have the homepage open in any browser
    Given User is on SERP page

  Scenario: Încarcă mai multe button presence and spelling
    Then the Load more button displayed on SERP Page
    And the Load more button is spelled "Încarcă mai multe"

  Scenario: Clicking on Încarcă mai multe button behaviour
    Then there are displayed 10 jobs displayed
    When click on Load more button loads more additional jobs as a total of 20

    Scenario: "Încarcă mai multe" button is no longer visible if there are no more jobs to display
      Then input a search parameter like "sofer"
      And click on Caută button
      Then there are displayed 10 jobs displayed
      And click on Load more button if not all job displayed
      When all job are displayed button is not longer visible