Feature: Place order on the Amazon website
@SmokeTest
Scenario Outline: Validate if the guest user is able to add a product to cart
Given user is logged onto the Amazon website as a guest user
When user searches a "<ProductID>" on the homepage
Then user should be able to view product information related to product searched
And user click on add to cart button
Then user verifies if the product is added to cart
When user navigates to order confirmation page via express checkout option
 
Examples:

| ProductID |

| Shirts |

