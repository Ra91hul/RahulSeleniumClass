Feature: To Delete Lead functionlaity of Leaftaps application
Scenario Outline: Delete a lead in Leaftaps application
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click on Leads link
Then My Leads Page should be displayed
When Click on Find Lead link
Then Find Leads Page should be displayed
When Click on Phone button
And Enter Phone number as '76'
And Click on Find Leads button
And Click on first generated link
Then View Page should be displayed
When Click on Delete button


Examples:
|username|password|
|'demosalesmanager'|'crmsfa'|