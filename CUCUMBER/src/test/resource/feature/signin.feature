  Feature:  verifying all possibe loginfunctionality
Scenario:  verify with valid data
Given user is in login page
When enter valid data in username  in inputfield
And enter valid data in password  in inputfield
And user enter  the login button
Then user should navigate to Dashboardpage


Scenario:  verify with Invalid data
Given user is in login page
When enter Invalid data in username  in inputfield
When enter Invalid data in password in  inputfield
And user click  the login button
Then user getting error message username and password are invalid

#Scenario:  verify with valid username and invalid password
#Given user is in login page
#When enter valid username  in inputfield
#When enter Invalid  password in  inputfield
#And user click  the login button
#Then user getting error message password  is  invalid

#Scenario:  verify with invalid username and valid password
#Given user is in login page
#When enter valid username  in inputfield
#When enter Invalid  password in  inputfield
#And user click  the login button
#Then user getting error message usename is  invalid

#Scenario:  verify with empty username and password
#Given user is in login page
#When enter valid username  in inputfield
#When enter Invalid  password in  inputfield
#And user click  the login button
#Then user getting error message i.e; username and password are required
