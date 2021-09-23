Feature: Addition

Scenario: Addition of two number
Given: I have two numbers as "9" & "12"
When: I do Addition
Then: Result should display in console

Scenario: Addition of two number with List
Given: I have two numbers as below List
| 8 |
| 9 |
When: I do Addition
Then: Result should display in console

Scenario: Addition of two number with Map
Given: I have two numbers as below Map
      | num1 | 8 |
      | num2 | 10 |
When: I do Addition
Then: Result should display in console