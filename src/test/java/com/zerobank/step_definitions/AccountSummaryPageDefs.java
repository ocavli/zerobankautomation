package com.zerobank.step_definitions;


import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountSummaryPageDefs {




    @Then("the	Account	Activity page	should	be	displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        String expectedURL= "http://zero.webappsecurity.com/bank/account-activity";
        Assert.assertTrue(Driver.get().getCurrentUrl().contains(expectedURL));
    }

    @When("the user clicks on	{string}	link on the Account	Summary	page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String string) {
        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        switch(string.toLowerCase()) {
            case "Savings":
                accountSummaryPage.savings.click();
                break;
            case "Brokarage":
                accountSummaryPage.brokerage.click();
                break;
            case "Checking":
                accountSummaryPage.checking.click();
                break;
            case "Credit Card":
                accountSummaryPage.creditCard.click();
                break;
            case "Loan":
                accountSummaryPage.loan.click();
                break;

        }



    }




}
