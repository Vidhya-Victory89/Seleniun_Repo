Feature: Create Lead Functionality Of Leaftaps Application

@sanity
Scenario Outline: Create Lead With Multiple Data
#Given Launch the browser and Load the URL
When Enter the UserName as 'Demosalesmanager'
And Enter the Password as 'crmsfa'
And Click on the LoginButton
Then Homepage should be displayed
When Click On CRMSFA link
And Click On Leads Link
And Click Create Lead Link
And Enter Company Name as <CompanyName>
And Enter First Name as <FirstName>
And Enter Last Name as <LastName>
And Click on Submit Button
Then ViewLeads Page Should Be Displayed

Examples: 
|CompanyName|FirstName|LastName|
|TCS|vidhya|Rajasekaran|
|HCL|Vignesh|Rajasekaran|

 
