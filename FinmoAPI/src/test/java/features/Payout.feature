Feature: Validating Payout Feature's APIs

@New
Scenario: Verify if we are able to create payout successfully using CreatePayoutAPI
	Given Post create payout payload 
	When user calls "CreatePayoutAPI" with "POST" http request
	Then the API call got created with status code 201
	

@New1
Scenario: Verify if we are able to get payout details successfully using GetPayoutDetailsAPI
	Given Getting payout details using payout id
	When user calls "GetPayoutDetailsAPI" with "GET" http request
	Then the API call got success with status code 200