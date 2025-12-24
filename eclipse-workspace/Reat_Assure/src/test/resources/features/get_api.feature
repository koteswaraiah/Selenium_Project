Feature: Basic GET API test

  Scenario: Validate GET request response
    Given the API endpoint is "https://jsonplaceholder.typicode.com/posts/1"
  
    When I send a GET request
    Then the response status code should be 200
    
    
    Scenario: Create a new post
    Given the POST API endpoint is "https://jsonplaceholder.typicode.com/posts"
    And I have a request body for creating a post
    When I send a POST request
    Then response status code should be 201
    And I validate the POST response
    
    Scenario: Delete a post
    Given the DELETE API endpoint is "https://jsonplaceholder.typicode.com/posts/1"
    When I send a DELETE request
    Then status code should be 200
    And I validate the DELETE response
    
      Scenario: Update an existing post
    Given the PUT API endpoint is "https://jsonplaceholder.typicode.com/posts/1"
    And I have a request body for updating a post
    When I send a PUT request
    Then code should be 200
    And I validate the PUT response




