@trying
Feature:	Navigating	to	specific	accounts	in	Accounts	Activity

  @Savings
  Scenario:	Savings	account	redirect
    Given the user is logged in
    When the user clicks on	"Savings"	link on the Account	Summary	page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Savings" selected


  @wip
  Scenario:	Savings	account	redirect
    Given the user is logged in
    When the user clicks on	"Savings"	link on the Account	Summary	page

  @Brokerage
  Scenario:	Brokerage	account	redirect
    Given the user is logged in
    When the user clicks on	"Brokerage"	link on the Account	Summary	page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Brokerage" selected

  @Checking
  Scenario:	Checking account redirect
    Given the user is logged in
    When the user clicks on	"Checking"	link on the Account	Summary	page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Checking" selected

  @CreditCard
  Scenario:	Credit	Card	account	redirect
    Given the user is logged in
    When the user clicks on	"Credit card"	link on the Account	Summary	page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Credit Card" selected

  @Loan
  Scenario:	Loan	account	redirect
    Given the user is logged in
    When the user clicks on	"Loan"	link on the Account	Summary	page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Loan" selected


    @ddtAccounts
    Scenario Outline: Accounts Redirect - <activities>
      Given the user is logged in
      When the user clicks on	"<activities>"	link on the Account	Summary	page
      Then the "Account Activity" page should be displayed
      And Account drop down should have "<activities>" selected

      Examples:
        | activities  |
        | Savings     |
        | Brokerage   |
        | Checking    |
        | Credit Card |
        | Loan        |



