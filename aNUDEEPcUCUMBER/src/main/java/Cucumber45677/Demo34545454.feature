Feature: Test me Parametarsiation

  Scenario Outline: Tesst ME Login for many iser
    Given I  launching the test me app in chrome
    And I click on the signin
    When I provideusername "<Uname>"
    And I provide password "<Pswrd>"
    Then I click on login and verify

    Examples: 
      | Uname       | Pswrd    |
      | asdfgh | asdfgh |
      | asdfgh     | asdfgh |
