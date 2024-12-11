Feature: Add Auto Form
@positivAddingAuto


Scenario: Positiv adding Auto
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User click LetTheCarWork link
    And User enters car details:
    And User adding photo
    And User clicks Submit button
    Then User successfully added new car
    And User quites browser
