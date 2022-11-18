Feature: Home Feature Scenario

  Background: 
    Given I have launched the application
    When I enter correct username and password
    And I click on the login button

  @regression
  Scenario: Adding a given product to the cart
    And I click on product "Sauce Labs Backpack"
    And I click on Add button
    Then The product should be available in the cart
