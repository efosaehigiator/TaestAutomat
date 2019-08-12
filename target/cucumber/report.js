$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("1LogIn.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify that a registered user can log in",
  "description": "",
  "id": "login;verify-that-a-registered-user-can-log-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the landing page of \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on \"Sign in\" tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter \"Username\" and \"Password\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on signIn button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I am logged in and a banner \"sale 70% of all products\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 29
    }
  ],
  "location": "LoginSteps.i_am_on_the_landing_page_of(String)"
});
formatter.result({
  "duration": 5449848722,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in",
      "offset": 12
    }
  ],
  "location": "LoginSteps.i_click_on_tab(String)"
});
formatter.result({
  "duration": 2029003899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Username",
      "offset": 9
    },
    {
      "val": "Password",
      "offset": 24
    }
  ],
  "location": "LoginSteps.i_enter_and(String,String)"
});
formatter.result({
  "duration": 260891613,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_signIn_button()"
});
formatter.result({
  "duration": 1778360218,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sale 70% of all products",
      "offset": 29
    }
  ],
  "location": "LoginSteps.i_am_logged_in_and_a_banner_is_displayed(String)"
});
formatter.result({
  "duration": 132531,
  "status": "passed"
});
formatter.uri("AddToBasket.feature");
formatter.feature({
  "line": 1,
  "name": "Add to basket",
  "description": "",
  "id": "add-to-basket",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify that I can add an item to Basket",
  "description": "",
  "id": "add-to-basket;verify-that-i-can-add-an-item-to-basket",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I click on T-Shirts",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the item is added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToBasketSteps.i_click_on_T_Shirts()"
});
formatter.result({
  "duration": 1917650297,
  "status": "passed"
});
formatter.match({
  "location": "AddToBasketSteps.i_click_on_Add_to_cart()"
});
formatter.result({
  "duration": 5597463334,
  "status": "passed"
});
formatter.match({
  "location": "AddToBasketSteps.i_click_on_Proceed_to_check_out()"
});
formatter.result({
  "duration": 1899711037,
  "status": "passed"
});
formatter.match({
  "location": "AddToBasketSteps.the_item_is_added_to_cart()"
});
formatter.result({
  "duration": 295455395,
  "status": "passed"
});
});