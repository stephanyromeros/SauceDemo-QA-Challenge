#Language: en

Feature: Purchase flow on SauceDemo
  As a registered user
  I want to log in, select a product and complete the checkout
  So that I can verify the full e-commerce functionality

  Background:
    Given the user opens the SauceDemo login page

  Scenario: Successful login
    When the user logs in with username "standard_user" and password "secret_sauce"
    Then the products page should be displayed

  Scenario: Add a product to the cart
    Given the user is logged in with username "standard_user" and password "secret_sauce"
    When the user adds the product "Sauce Labs Backpack" to the cart
    Then the cart should contain the product "Sauce Labs Backpack"

  Scenario: Complete a purchase successfully
    Given the user is logged in with username "standard_user" and password "secret_sauce"
    And the user has added the product "Sauce Labs Backpack" to the cart
    When the user proceeds to checkout entering:
      | firstName | Test |
      | lastName  | User |
      | zip       | 12345 |
    Then the user should see the confirmation message "Thank you for your order!"

