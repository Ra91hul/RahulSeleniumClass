Feature: Merge Lead functionlaity of Leaftaps application
Scenario Outline: To Merge Lead in Leaftaps application
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click on Leads link
Then My Leads Page should be displayed
When Click on Merge Lead link
Then My Leads Page should be displayed
When Enter From Lead
And Enter To Lead
And Click on Merge button
Then View Page should be displayed

Examples:
|username|password|
|'demosalesmanager'|'crmsfa'|
