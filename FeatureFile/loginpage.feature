Feature: This is to Automate loginpage
#Background: 
# Scenario:This is to Automate Login Page
# Given User enters the URL
# When user enters the  Valid Username 
# And user enters the  Valid Password
# And user click on the login button 
# Then User Succesfully login to the Home page
#
#Scenario Outline: To test the login page objects 
# Given User enters the URL
# When user enters the "<username>" Valid Username 
# And user enters the "<password>" Valid Password
# And user click on the login button 
# Then User Succesfully login to the Home page 
# Examples:
# |username|password|
# |AAA|111|
# |BBB|222|
# |CCC|333|
# |ajith666|@jithkumar1998J|
@login
Scenario: This is to Automate Login Page
Given User enters the URL
 When user enters the  Valid Username 
 And user enters the  Valid Password
 And user click on the login button 
 Then User Succesfully login to the Home page
 @searchhotel
Scenario: To Test the Search Hotel Options Functionality
 When user Selects the location 
 When User Selects the Hotels
 And User Selects Room type
 And User Selects Number of Rooms
 And User Selects  the Checkin Date
And  user Selects the Check out Date
And User selects the Adults per room
And user selects the Children per room
Then User click on the Search Button 
@bookitenary
Scenario: This is to Automate BookItenary Page
When User selects the select Rado Button
When User click on the continue button
And user enters the First Name 
And User enters the Lasr Name 
And User enters the Billing Address
And User enters the Credit Card number
And User selects the Credit card type
And User Selects the Expmonth
And USer Selects the EXPYear
And User Enters the CVV Number
And  User click on the Booknow Button
Then User clickon the Book My itenaryButton
@passwordchage
Scenario: This is to Automate Password Change Page
When User Clickson the Password Change Button
And User enters the Current Password
And User enters the New Password
And User re-enters the New Password
Then  User clicks on the Submit Button
@logoutbutton
Scenario: This is to Automate Logout Button
When User Click On the Logout Button
Then User verifies that Succesfully Logout from the Application
