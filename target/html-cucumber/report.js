$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/phase2_features/Phase2Home.feature");
formatter.feature({
  "name": "Home Feature Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "phase2_stepdefs.Phase2Login.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter correct username and password",
  "keyword": "When "
});
formatter.match({
  "location": "phase2_stepdefs.Phase2Login.i_enter_correct_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "phase2_stepdefs.Phase2Login.i_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding a given product to the cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I click on product \"Sauce Labs Backpack\"",
  "keyword": "And "
});
formatter.match({
  "location": "phase2_stepdefs.Phase2Home.i_click_on_product(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add button",
  "keyword": "And "
});
formatter.match({
  "location": "phase2_stepdefs.Phase2Home.i_click_on_Add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The product should be available in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "phase2_stepdefs.Phase2Home.the_product_should_be_available_in_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/phase2_features/Phase2Login.feature");
formatter.feature({
  "name": "Login Feature Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "phase2_stepdefs.Phase2Login.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario defines positive login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "I enter correct username and password",
  "keyword": "When "
});
formatter.match({
  "location": "phase2_stepdefs.Phase2Login.i_enter_correct_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "phase2_stepdefs.Phase2Login.i_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see shopping cart container as \"shopping_cart_container\"",
  "keyword": "Then "
});
formatter.match({
  "location": "phase2_stepdefs.Phase2Login.i_should_see_shopping_cart_container_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});