Feature: Login with a valid create parameters
  Scenario: Login with a valid username and password
    Given I visit the main "page" of Mercury Tours
    When I fill the fields "username" and "password"
    Then To check the user, the title SIGN-OFF is displayed