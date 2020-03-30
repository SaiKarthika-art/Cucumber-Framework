$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/Checkout.feature");
formatter.feature({
  "name": "Place order on the Amazon website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate if the guest user is able to add a product to cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user is logged onto the Amazon website as a guest user",
  "keyword": "Given "
});
formatter.step({
  "name": "user searches a \"\u003cProductID\u003e\" on the homepage",
  "keyword": "When "
});
formatter.step({
  "name": "user should be able to view product information related to product searched",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "name": "user verifies if the product is added to cart",
  "keyword": "Then "
});
formatter.step({
  "name": "user navigates to order confirmation page via express checkout option",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ProductID"
      ]
    },
    {
      "cells": [
        "Shirts"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate if the guest user is able to add a product to cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user is logged onto the Amazon website as a guest user",
  "keyword": "Given "
});
formatter.match({
  "location": "Checkout.user_is_logged_onto_the_Amazon_website_as_a_guest_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches a \"Shirts\" on the homepage",
  "keyword": "When "
});
formatter.match({
  "location": "Checkout.user_searches_a_on_the_homepage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to view product information related to product searched",
  "keyword": "Then "
});
formatter.match({
  "location": "Checkout.user_should_be_able_to_view_product_information_related_to_product_searched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "Checkout.user_click_on_add_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies if the product is added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Checkout.user_verifies_if_the_product_is_added_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to order confirmation page via express checkout option",
  "keyword": "When "
});
formatter.match({
  "location": "Checkout.user_navigates_to_order_confirmation_page_via_express_checkout_option()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Scenario passed");
formatter.after({
  "status": "passed"
});
});