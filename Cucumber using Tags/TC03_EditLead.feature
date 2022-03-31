Feature: Login and Edit Leads in Leaftaps

Background: 
Given A chrome browser is launched
And Load the Leaftaps url

@functional
Scenario Outline: TC003 EditLead Leaftaps

Given give username as <username>
And give password as <password>
When click login to enter the application
Then Welcome page should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' should be displayed
When Click on 'Leads' link
Then 'My Leads' should be displayed

Given Click Find Leads
And enter the username as test
And click Find Leads button
And click the first displayed Lead ID
Then Verify the title

Given click Edit button
And update the company name as 'TATA'
And click the update button
Then print the company name


Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
