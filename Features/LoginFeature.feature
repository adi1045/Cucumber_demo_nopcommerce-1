Feature: Login

Scenario: Successful Login with valid credentials
   Given User Launch Chrome Browser
   When user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
   And user enters Email as "admin@yourstore.com" and Password as "admin"
   And click on login
   Then Page Title should be "Dashboard / nopCommerce administration"
   When User click on Log Out Link
   Then Page Title should be "Your store. Login"
   And Close browser
   
   Scenario Outline: Successful Login with valid credentials
   Given User Launch Chrome Browser
   When user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
   And user enters Email as "<email>" and Password as "<password>"
   And click on login
   Then Page Title should be "Dashboard / nopCommerce administration"
   When User click on Log Out Link
   Then Page Title should be "Your store. Login"
   And Close browser
   
   Examples:
   |email|password|
   |admin@yourstore.com|admin|
   |test@yourstore.com|admin|
   