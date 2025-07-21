Feature: Check home page functionality

  Background: Login with valid credentials
    Given User ia navigated to login page
    When User enter UN and PWD
    And user clicks on login button
    Then User logged in successfully and navigated to Home page


  @smoke
  Scenario: verify user navigate to dashboard
    When User click on dashboard
    Then user navigated to dashboard

  @smoke
  Scenario: verify user is able to logout
    When User click on logout button
    Then User logged out and navigated to login page