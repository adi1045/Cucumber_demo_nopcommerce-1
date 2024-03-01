Feature:Login

Scenario: Successful Login with valid credentials
   Given User Launch Chrome Browser
   When user opens URL
   And user enters Email as "admin@yourstore.com" and Password as "admin"
   And click on login
   Then Page Title should be "Dashboard / nopCommerce administration"
   When User click on Log Out Link
   Then Page Title should be "Your store. Login"
   And Close browser