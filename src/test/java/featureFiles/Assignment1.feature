
Feature: API Testing

  @tag1
  Scenario: POST Method
    Given API for testing
    When posted with correct information
    Then validate positive response code received
  

  @tag2
  Scenario: GET Method
  Given Api for testing
  When Retrieve correct information
  Then validate positive response code
  
  @tag3
  Scenario: PUT Method
  Given API for PUT testing
  When Update correct information
  Then validate positive response code for put method
  
  @tag4 
  Scenario: PATCH Method
  Given API for Patch testing
  When Patch correct information
  Then validate positive response code for patch method
  
  @tag5
  Scenario: DELETE Method
  Given API for Delete testing
  When Delete correct information
  Then validate positive response code for delete method
  
  @tag6
  Scenario: POST2 Method
    Given API for testing Post register
    When post with correct information
    Then validate positive response code received for successful register
    
  @tag7
  Scenario: Negative get scenario
  Given API for testing negative get method
  When retrieved incorrect information
  Then Validate negative response code for negative get method
  
  @tag8
  Scenario: Negative Post Scenario
  Given API for testing negative post method
  When posted incorrect information
  Then Validate negative response code for negative post method
  
  
  