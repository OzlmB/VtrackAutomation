Feature: Login Functionalities

  Background:



  Scenario Outline:entering with valid credentials
    Then the user enter "<valid username>" and "<valid password>"
    Examples:
      | valid username  | valid password |
      | user5           | UserUser123    |
      | salesmanager101 | UserUser123    |
      | storemanager85  | UserUser123    |

  Scenario: after valid credentials
    Then "Driver" should land on the "Quick Launchpad" page after successful login
    Then "Sales Manager" or "Store Manager" should land on the "Dashboard" page after successful login

  @PERF-924
  Scenario: The system shouldn't allow users to access the application without providing credentials
    Given copy the url after log in then log out paste the same url to browser and try to skip authentication step

  @PERF-926 Given the user is on the login page
  Scenario Outline:entering with invalid credentials
    Then the user enters invalid credentials "<invalid username>" and "<invalid password>"
    And after "Invalid username or password." message should be displayed for invalid credentials
    Examples:
      | invalid username | invalid password |
      | user5            | 1234567          |
      | abcdefg          | UserUser123      |
      | salesmanager101  | dnjd3445         |

  @PERF-928
  Scenario Outline:entering with blank credentials
    When the user enters blank credentials "<blank username>" and "<blank password>" and  "Please fill out this field." message should be displayed for any empty field
    Examples:
      | blank username | blank password |
      |                |                |


  @PERF-934
  Scenario: bullet sign
    Given Users should see their password in bullet signs while typing

  @PERF-936 @wip
  Scenario:Forgot Password menu
    When User lands on the ‘Forgot Password’ page after clicking on the "Forgot your password?" link
    Then Users can change their password with the username after clicking on "Forgot your password?" link

  @PERF-939 @wip
  Scenario: Remember me on this computer link
    Given User can see "Remember me on this computer" link on the login page and it should be clickable

  @PERF-942 @wip
  Scenario:User can use "Enter" key
    Given User can use "Enter" key from their keyboard on the login page after entering username and password

  @PERF-944 @wip
  Scenario: drivers can see their own usernames
    Given drivers can see own username in profile menu, after successful login


  @PERF-946 @wip
  Scenario: sales manager can see their own usernames
    Given sales manager can see own username in profile menu, after successful login

  @PERF-947 @wip
  Scenario: store manager can see their own usernames
    Given store manager can see own username in profile menu, after successful login










