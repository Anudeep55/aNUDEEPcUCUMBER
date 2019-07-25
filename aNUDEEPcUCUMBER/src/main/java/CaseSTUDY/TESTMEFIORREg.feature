Feature: Test me Parametarsiation

  Scenario Outline: Tesst ME Login for many iser
    Given I  launching the test me app in chrome
    And I click on the signin
    When I provideusername "<UserName>"
    When I provideusername "<fname>"
    When I provideusername "<lname>"
    And I provide password "<Pswrd>"
    And I provide password "<Cnfrm>"
    And I provide password "<Email>"
    And I provide password "<MoNo>"
    And I provide password "<dob>"
    And I provide password "<Adress>"
    And I provide password "<Answer>"
    Then I click on login and verify

    Examples: 
      | UserName | fname   | lname  | Pswrd  | Cnfrm  | Email     | MoNo       | dob        | Adress                              | Answer |
      | Andy557  | mareddy | asndhd | asdfgh | asdfgh | mar@gmail | 9999999999 | 17/12/1998 | aydysjdfajdfajdajdfasfdjdffdjadfjad | London |
