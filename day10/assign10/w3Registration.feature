Feature: Registration Process for Responsive Checkout Form

Scenario Outline: Registration with positive credentials
Given Launch the Browser and Load the URL
When Switch the iframe with the id iframeResult
And Enter Full Name as <fullname>
And Enter Email-id as<email>
And Enter Address as <address>
And Enter City as <city>
And Enter State as <State>
And Enter Zip Code as <zip>
And Enter Expiry Year as <expyear>
And Enter CVV as <cvv>
And Enter Month as <expmonth>
And Enter Credit Card Number as <creditnumber>
And Enter Name on Card as <cardname>
And Click on Continue To Checkout
Then Form Should Be Submitted
And Close the Browser

Examples: 
|fullname|email|address|city|State|zip|cvv|creditnumber|cardname|
|vidhya|vithravictory89@gmail.com|padur|chennai|TamilNadu|603103|123|2345|Vidhya|
|arun|arun.prakash@gmail.com|padur|chennai|TamilNadu|603103|233|4567|Arun|


Scenario Outline: Registration with negative credentials
Given Launch the Browser and Load the URL
When Switch the iframe with the id iframeResult
And Enter Full Name as <fullname>
And Enter Email-id as<email>
And Enter Address as <address>
And Enter City as <city>
And Enter State as <State>
And Enter Zip Code as <zip>
And Enter Expiry Year as <expyear>
And Enter CVV as <cvv>
And Enter Month as <expmonth>
And Enter Credit Card Number as <creditnumber>
And Enter Name on Card as <cardname>
And Click on Continue To Checkout
But Form Should Not Be Submitted
And Close the Browser


Examples: 
|fullname|email|address|city|State|zip|cvv|creditnumber|cardname|
|12345|aaa@gmail.com|padur|chennai|603103|255|12345|12345|