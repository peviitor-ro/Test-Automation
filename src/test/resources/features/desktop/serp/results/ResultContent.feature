@ResultContent
Feature: Result returned content

  Background: You have the homepage open in any browser
    Given User is on SERP page

  Scenario: Number of jobs displayed On SERP Page
    Then there are displayed 10 jobs displayed

  Scenario: Result job section details
    Then the job name displayed in the job result section
    And the company`s name displayed in the job  result section
    And the country name displayed in the job result section
    And the country icon displayed n the job result section
    
