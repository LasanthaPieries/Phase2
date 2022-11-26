Feature: Login Feature Scenario

  Background: 
    Given I have launched the application

  @sanity
  Scenario: This scenario defines positive login
    When I enter correct username and password
    And I click on the login button
    Then I should see shopping cart container as "shopping_cart_container"

  Scenario: This scenario validates nagative login by entering incorrect username and/or password
    When I enter incorret username password
    And I click on the login button
    Then Displayed error message "Epic sadface: Username and password do not match any user in this service"
