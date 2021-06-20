@regression
Feature: Login

  Scenario: User is able to login into application

    Given user enters username
    When user enters password
    And user clicks Login button
    Then user is logged into the application