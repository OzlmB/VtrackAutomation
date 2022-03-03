
Feature: LogOut Functionalities
  Background:
    Given the user is on the login page

   @logout @PERF-986
  Scenario: User can log out
    Given "User" can log out by using log out button inside profile info and ends up in login page.

  @logout @PERF-994
  Scenario:The user can not go to the home page again
    Given The "user" can not go to the home page again by clicking the step back button after successfully logged out.

  @logout @PERF-996
  Scenario: The user must be logged out if the user close the tab
    Given The "user" must be logged out if the user close the tab (if there are multiple open tabs in the app, close all of them)

  @logout @PERF-997
  Scenario: Keyboard
     Given The "user" must be logged out if the user is away from keyboard for three minutes