Feature: Registration

  Scenario: valid Registration
    Given I navigate to propertyrete site
  When I click on register button
    And I enter firstname
    And I enter lastname
    And I enter email
    And I select country flag
    And I enter  phone number
    And I enter password
    And I confirm password
    And I click on create account button
    And an error message was received
#    And I receive a popup message advising about receipt of activation code via sms
#    And I receive activation code via sms
#    And iI click on the link sent to via sms
#    And I enter the code in the activation code field
#    And I click on activate account button
#    Then I am  not registered



