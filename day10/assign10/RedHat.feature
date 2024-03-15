Feature: Registration Process On a Red Hat Portal

Scenario Outline: Registration With Positive Credentials
Given Launch the Browser and Load the URL
When Click on the "Register for a Red Hat account" button
And Verify that the registration form is displayed
And Enter UserName as "<username>"
And Enter Password as "<password>"
And Enter Confirm Password as "<confirmpassword>"        
And Enter FirstName as "<firstname>"
And Enter LastName as "<lastname>" 
And Enter Email as "<email>"
And Enter Phone as "<phone>"
And Choose the Account type as 'Personal'
And Select "India" as the country from the dropdown
And Enter Address as "<address>"
And Enter Postal Code as "<postalcode>"
And Enter City as "<city>"
And Select "Tamil Nadu" as the state
Then  Form Should Be Submitted
And Close the Browser

Examples:
|username|password|confirmpassword|firstname|lastname|email|phone|address|postalcode|city|
|username1|password1|confirmpassword1|firstname1|lastname1|email1|phone1|address1|postalcode1|city1|
|username2|password2|confirmpassword2|firstname2|lastname2|email2|phone2|address2|postalcode2|city2|




Scenario Outline: Registration With Negative Credentials
Given Launch the Browser and Load the URL
When Click on the "Register for a Red Hat account" button
And Verify that the registration form is displayed
And Enter UserName as "<username>"
And Enter Password as "<password>"
And Enter Confirm Password as "<confirmpassword>"        
And Enter FirstName as "<firstname>"
And Enter LastName as "<lastname>" 
And Enter Email as "<email>"
And Enter Phone as "<phone>"
And Choose the Account type as 'Personal'
And Select "India" as the country from the dropdown
And Enter Address as "<address>"
And Enter Postal Code as "<postalcode>"
And Enter City as "<city>"
And Select "Tamil Nadu" as the state
But Form Should Not Be Submitted
And Close the Browser

Examples:
|username|password|confirmpassword|firstname|lastname|email|phone|address|postalcode|city|
|username1|password1|confirmpassword1|firstname1|lastname1|email1|phone1|address1|postalcode1|city1|
|username2|password2|confirmpassword2|firstname2|lastname2|email2|phone2|address2|postalcode2|city2|

