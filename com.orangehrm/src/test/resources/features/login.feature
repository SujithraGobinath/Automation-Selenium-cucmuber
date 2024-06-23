@Login
Feature: customer page

  Scenario Outline: To enter the values in the fields of the customer page
    Given Given Open the login page
    And enter '<username>' and '<password>'
    Then  click login
    And  move to PIM page
    Then enter '<Employee name>' and '<Employee Id>' in the fields
    And search with given data
    Then delete the data
    #And handle the alert
    Examples:
      | username | password | Employee name | Employee Id |
      | Admin    | admin123 | David Morris  | 0066        |
      | Admin    | admin123 | Jadine Jackie | 0243        |
      | Admin    | admin123 | Nina Patel    | 0074        |