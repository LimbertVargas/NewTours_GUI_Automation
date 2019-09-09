Feature: Login
  Scenario: Login with a valid user
    Given I visit the page
    When I fill the fields "username" and "password"
    Then To check the user the title FLIGHT FINDER is displayed