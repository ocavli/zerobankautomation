package com.zerobank.step_definitions;


import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.BasePage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.cs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountSummaryPageDefs {








    @When("the user clicks on	{string}	link on the Account	Summary	page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String string) {

        switch(string) {
            case "Savings":
                new AccountSummaryPage().activities("Savings").click();
                break;
            case "Brokerage":
                new AccountSummaryPage().activities("Brokerage").click();
                break;
            case "Checking":
                new AccountSummaryPage().activities("Checking").click();
                break;
            case "Credit Card":
                new AccountSummaryPage().activities("Credit Card").click();
                break;
            case "Loan":
                new AccountSummaryPage().activities("Loan").click();

                break;

        }



    }




    @When("user navigate to {string}")
    public void userNavigateTo(String titleName) {
        new AccountSummaryPage().navigateTo(titleName);

    }


}
