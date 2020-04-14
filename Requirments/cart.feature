Feature: CartPageValidate

Scenario Outline: Verify product price
Given User Added the Product to cart <Product>
Then User should see the price details of the product
When user Increases the Quantity the price of the product should be doubled

Examples:
|Product|
|Faded Shorts|