Feature: Login feature of application

@home
Scenario: Login the application with valid credentials
Given launch the application
When user click on login link
And user login with "raju.kbn04@gmail.com" and "Mango@123"
Then user on the mainpage