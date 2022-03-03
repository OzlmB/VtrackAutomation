
Feature: Add Event 2 Automation

  Background:
    Given  the user is on the login page

  Scenario: Access the Fleet-Vehicle module
    When the user clicks "Fleet" menu
    Then the users clicks "Vehicle" menu
    And the user should be on "Cars" page
@add
  Scenario: Add Event button
    When the user rows down on the page
    Then the user clicks on any vehicles
    And the user can access the Add Event page from the general information page

  Scenario:Marking the event with any color
    When the user clicks "Add Event" button
    Then "Add Event" page should be pop up
    And  the user can mark the event with any color

  Scenario:"All-day event" button
    When the user can mark "All day event" button

  Scenario:Repeating the action by specifying occurrence periods and ending time
    When the user clicks "Repeat" button
    Then Repeat option should includes the options below
      | Daily   |
      | Weekly  |
      | Monthly |
      | Yearly  |
    And the user clicks "Ends" button
    And Ends option should be as below and clickable
      | Never |
      | After |
      | By    |

    Scenario: Verify the "All Events"
      When All Users can see all events in the General information page

