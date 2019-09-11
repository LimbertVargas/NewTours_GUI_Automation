Feature: Register a new User
  Scenario: Register a new user using valid credentials
    Given: I go the REGISTER page in main page of Mercury Tours
    # It is not necessary to specify the name of the application
    # It is not a precondition, so it should be a When
    # When I go to Register page
    When: I fill the fields "User Name", "Password" and "Confirm Password"
    # You should have the values for that information, not just the fields. It is not necessary to confirm the password because it is the same value
    # And I register a new user with the following values
    # | User Name | Test     |
    # | Password  | password |
    Then: To verify the new account check the text "Note: Your user name is LimbertTest"
    # I don't understand the verification, show me tomorrow please



Feature: Register a new User
  Scenario: Register a new user using valid credentials
    When: I go to Register page
      And: I register a new user with the following values
        | User Name | Test     |
        | Password  | password |
    Then: To verify the new account check the verification text

