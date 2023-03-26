@SeeJobButton
Feature: Vezi postul button and behaviour

  Background: You have the homepage open in any browser
    Given User is on SERP page

    @SeeJob
    Scenario: Vezi postul presence and behaviour
      Then the button Vezi postul is displayed
      And is spelled as "Vezi postul"
      And clicking on the Vezi postul  button opens  a new tab