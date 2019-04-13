Feature: Testing a REST API
  Users should be able to submit GET and POST requests to a web service, 
  represented as employee portal
 
  Scenario: Register employee to a web service
    When users register employee on a project
    Then the server should handle it and return a success status
 
  Scenario: List all employee from a web service
    When users want to list all the employee
    Then list of employee is returned