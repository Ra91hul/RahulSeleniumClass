Feature: login functionality for leaftaps application
   using Gherkin language
 

#Background:
#Given Open the chrome browser
#And Load the application url 'http://leaftaps.com/opentaps/'

@functional
Scenario Outline: login test using postive credential
And Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed


Examples:
|username|password|
|'demosalesmanager'|'crmsfa'|


#@smoke @functional
#Scenario: login test using negative credential
#And Enter the username as 'Demo123'
#And Enter the password as 'crmsfa'
#When Click on Login button
#But Error message should be displayed