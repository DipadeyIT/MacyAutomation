@Macys
Feature: Create Macys Account

Scenario Outline: Create a valid Macys account


    Given I am on macys home page
    When I click on the menu icon
   	And I click on my account
   	And I click on sing in button
   	And I click on my account
   	And I click on creat account
   	And I enter my first name as "<firstName>"
   	And I enter my last name as "<lastName>"
   	And I enter my email address as "<email>"
   	And I enter my password as "<password>"
   	And I select my birthMonth as "<month>"
   	And I select my birthDate as "<day>"
   	And I click on create account
   	Then we receive the account successfully created message
   	
   	
    Examples: 
      | firstName | lastName	| email									|password		| month | day	|
      | Dipa 			| Dey				|dipadey1233@gmail.com	|Asdfasd123@|	March	|	07	|
      | lipa 			|  dey			| lipa2345@yahoo.com	  |Bcdef45!		|	April	|	22	|

      

 
 