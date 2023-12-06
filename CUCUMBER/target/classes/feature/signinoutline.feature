Feature:  verifying all different productname in searchfield
Scenario Outline: verify product search functionality with multiple data
 Given open browser enter url
When enter valid data in user enter username
And enter valid data in user enter password
And user enter  the signin button
Then user should navigate to homepage
When click opn catologlink and productpage
When user enter product name as<product>
And click search button then particular record should be displayed
    

    Examples: 
    |product|
     |  Apple MacBook Pro 13- inch | 
     | Windows 8 Pro |
      
