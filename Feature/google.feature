Feature: Google homepage

  Scenario: Logo verification in home page
    Given I launch the chrome browser
    When I open Google Home page
    Then I verify the logo in home page
    And I close the Browser