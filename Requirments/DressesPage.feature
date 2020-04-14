Feature: DressesPageverify

Scenario Outline: Verify Product Count

Given User launch the application
When User Click on the tab "<tab>"
Then User should see the same number of products count matching with the product header count displayed

Examples:
|tab|
|DRESSES|


Scenario Outline: Verify Product Count

Given User launch the application
When User Click on the tab "<tab>"
And the click on Add to cart button for the product "<product>"
Then the product should added to cart page

Examples:

|tab|product|
|DRESSES|Printed Chiffon Dress|
