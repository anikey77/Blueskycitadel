Feature: login

#  Background:
#    Given I navigate to propertyrete website
#    When I click on login button

 Scenario Outline:
   Given I navigate to propertyrete website
   When I click on login button
    And I enter valid email "<email>"
    And I enter valid  password "<password>"
    And I click on sign in
   And welcome message displayed
    Then I am logged in


   Examples:
   |Email                 |Password|
   |johntrott727@yahoo.com|korede|
#   |johnrott@yahoo.com |testing19|
#   |johntrott727@yahoo.com|testng19 |
#  Scenario: invalid login
#
#    And I click on sign in botton
#    And I enter invalid email
#    And I enter valid password
#    And I click on sign in
#    Then I am not logged in
