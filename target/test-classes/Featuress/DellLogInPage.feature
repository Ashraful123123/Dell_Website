Feature: Dell Login verification


@DellLogin
Scenario: Verify User Can Login

	Given Open Dell Web Application "<URL>" 
	Then click On Sign In Button
	Then click Signin Link
	Then enter Username Password And Click Signin
	Then verify User Can Login
	
	
	

	