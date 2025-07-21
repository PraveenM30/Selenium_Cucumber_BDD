Feature: Login

Scenario: Login with valid credentials
  Given User launch chrome browser
  When User opens URL "https://admin-demo.nopcommerce.com/login"
  And User enters Email as "admin@yourstore.com" and Password as "admin"
  And Click on Login
  Then Page title should be "Dashboard / nopCommerce administration"
  When User click on signOut button
  Then Page title should be "Welcome, please sign in!"
  And close the Browser

#  Scenario Outline: Login with valid credentials
#    Given User launch chrome browser
#    When User opens URL "https://admin-demo.nopcommerce.com/login"
#    And User enters Email as "<email>" and Password as "<password>"
#    And Click on Login
#    Then Page title should be "nopCommerce demo store. Login"
#    When User click on signOut button
#    Then Page title should be "Welcome, please sign in!"
#    And close the Browser
#
#    Examples:
#    |email | password |
#    |admin@yourstore.com|admin|
#    |admin1@yourstore.com|admin123|