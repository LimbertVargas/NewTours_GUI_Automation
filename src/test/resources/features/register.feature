Feature: Register a new User
  Scenario: Register a new user using valid credentials
    Given: I go the REGISTER page in main page of Mercury Tours
    When: I fill the fields "User Name", "Password" and "Confirm Password"
    Then: To verify the new account check the text "Note: Your user name is "LimbertTest"
