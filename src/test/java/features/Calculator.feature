Feature: This is the calculator program to add and sub the nos

  Scenario: To add the number
    Given I have a calculator
    When I add 3 and 4
    Then the result should be on the screen as 7

  Scenario: To sub the number
    Given I have a calculator
    When I sub 9 and 7
    Then the result should be on the screen as 2

  Scenario Outline: To add the numbers dynamically
    Given I have a calculator
    When I add <num1> and <num2>
    Then the result should be on the screen as <output>

    Examples: 
      | num1 | num2 | output |
      |   20 |   30 |     50 |
      |    2 |    5 |      7 |
      |    0 |   40 |     40 |

  Scenario Outline: To sub the numbers dynamically
    Given I have a calculator
    When I sub <num1> and <num2>
    Then the result should be on the screen as <output>

    Examples: 
      | num1 | num2 | output |
      |   50 |   30 |     20 |
      |   12 |    5 |      7 |
      |   40 |   40 |      0 |

  Scenario: Add multiple numbers using cucumber data table
    Given I have a calculator
    When I add below numbers
      | 4 |
      | 5 |
      | 6 |
    Then the result should be on the screen as 15

  Scenario: Add multiple numbers using cucumber data table
    Given I have a calculator
    When I add below numbers from the list
      |  4 |
      |  5 |
      |  6 |
      | 10 |
    Then the result should be on the screen as 25

  Scenario: To calculate Total bill of the order
    Given I have a calculator
    When I order below items
      | coffee   | 23 |
      | Tea      | 27 |
      | biscuits | 45 |
    Then the result should be on the screen as 95

  Scenario: To calculate Total bill of the order using Quantity
    Given I have a calculator
    When I order below items and Quantity
      | coffee   | 23 | 2 |
      | Tea      | 27 | 2 |
      | biscuits | 45 | 2 |
    Then the result should be on the screen as 190
