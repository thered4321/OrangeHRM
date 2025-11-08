Feature: Test OrangeHRM

@Anand @Regression
Scenario: Test login functionality 
Given user open login page url on "Chrome" driver 
When user enters invalid username and password
Then user verify error credentials message
@Anand @Regression
Scenario: Test login functionality
When user enters valid username and password
Then user click on login button 