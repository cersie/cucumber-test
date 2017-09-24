Feature: Flipkart Assignment

  Scenario: Flipkart cart Item confirmation
    Given Open selenium webdriver
    When  Open page 'https://www.flipkart.com/account/login?ret=/'
    And   I Login with username as '8310288384' and password as '12345password'
    And   I search for 'iphone 7'
    And   I add first item in the cart
    Then  I Verify product 'Apple iPhone 7 (Black, 32 GB)' has been added in the cart
    