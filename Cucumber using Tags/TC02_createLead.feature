Feature: Login and Create Leads in Leaftaps

Background: 
Given A chrome browser is launched
And Load the Leaftaps url

@regression @functional @sanity
Scenario Outline: TC002 -  Login Leaftaps and create lead

Given give username as <username>
And give password as <password>
When click login to enter the application
Then Welcome page should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' should be displayed
When Click on 'Leads' link
Then 'My Leads' should be displayed

Given Click create Lead button

And Give company name as 'Testleaf Services'
And Give firstname as 'Test'
And Give lastname as 'Leaf'
And Give phone number as '9191123456'
When clicks create lead button
Then Leads should be created

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|


