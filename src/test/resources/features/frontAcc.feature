Feature: login Functionality
   
  Scenario Outline: To do data driven testing on Login Functionality
  Given: User is on Login Page
  When: user enters username as "<userName>" & password as "<passWord>" & clicks on login 
  Then: login "<loginType>" should happen
  
  Examples:
  | userName | passWord | loginType |
  | xyz      | password | shouldNot |
  | demouser | password | should    |
  | admin    | admin123 | shouldNot |
  | hr       | hr123    | should    |