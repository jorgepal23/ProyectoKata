Feature: User activate the checkbook options

  Background:
    Given The user open the PPE URL
    And Enter the user and password and click to dominio button
    When The user click in the button Ingresar

  Scenario: Enter the menu CheckBooks activate or ONP
    Given The user click the Checkbook activate button
    When The user select the basic dates and click in the button Search
    And The user select the account select the checkbook and click in the button Activate
    Then The user will be see the message succesfull