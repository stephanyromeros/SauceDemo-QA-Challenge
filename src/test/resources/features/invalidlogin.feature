#Language: english

Feature: Invalid Login
  As a user
  I want to receive an error message when I log in incorrectly
  So that I can know the credentials are invalid

  Scenario: Login with invalid credentials
    Given the user opens the application
    When the user tries to log in with username "locked_out_user" and password "secret_sauce"
    Then the error message "Epic sadface: Sorry, this user has been locked out." should be displayed