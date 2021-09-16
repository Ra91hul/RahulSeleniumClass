Feature: Create Lead functionlaity of Leaftaps application
Scenario Outline: To create a lead
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click on Leads link
Then My Leads Page should be displayed
When Click on Create Lead link
Then Create Lead Page should be displayed
When Enter company name as 'TCS'
And Enter the first name as 'Rahul'
And Enter the last name as 'Singh'
And Enter the phone number as '91'
And Click on Create lead button

Examples:
|username|password|
|'demosalesmanager'|'crmsfa'|
