Feature: Check user is able to add item and remove from cart
@Priority3
Scenario:
Successfully Added into cart and removed item from cart
Given Page should open in default browser
When Page loads navigate to product page
And Add item to cart 
And Go to Cart page 
And remove item from cart
Then removed item successfully 