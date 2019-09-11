Feature: Reserve destination
  Scenario: Reserve destination using a "Flight Details" and "Preferences"
    Given: I go to "Flights" page
    When: I select in "Flight Details" field fill "Type", "Passengers", "Departing From", "On", "Arriving In" and "Returning"
    And: In "Preferences" field fill "Service Class" and "Airline"
    And: Press to "CONTINUE" for go to the next page
    And: Select in "DEPART" and "RETURN" the flight from the selections below
    Then: Verify the itinerary is benn booked with a text "Your itinerary has been booked"