Feature: Add New Customer

Scenario: Customers

Given User Launch Chrome Browser
   When user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
   And user enters Email as "admin@yourstore.com" and Password as "admin"
   And click on login
Then User Can View Dashboad
When User click On Customer Menu
And Click On Customer Menu Item
And Click On Add New Item
Then User Can View Add New Customer Page
When User Enter Customer Info
And Click On Save button
Then User Can View Confirmation Message "The new customer has been added successfully."
   And Close browser