Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success message is displayed
    And User quites browser


    @wrongPassword
    Scenario Outline: Login with valid data
      Given User launches Chrome browser
      When User opens ilCarro HomePage
      And User clicks on Login link
      And User enters valid email and wrong password
      | email | password |
      | <email>    |  <password> |
      And User clicks on Yalla button
      Then User verifies Error message is displayed
      And User quites browser
      Examples:
        | email | password |
      |  dana@gm.com |    dana@12345 |
      |  dana@gm.com |    Dana@1234 |
      |  dana@gm.com |    Dana!1245 |


