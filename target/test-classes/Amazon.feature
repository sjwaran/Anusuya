Feature: Validating Amazon Add to cart page

  Scenario: vaidating product product from addTOcart is removed
    Given I am on Amazon page
    When I need to enter userName and Password and Click login button
    Then I need to validate MY username is present on right side header page of Homepage
    When I need to search for a product
    And I need to click a particular product from search list and add to card
    Then I need to verify Product is added successfully
    And I need to procedd for payment
    And GO back to cart page and remove product from cart
    Then I need to verify that product is removed from the cart
