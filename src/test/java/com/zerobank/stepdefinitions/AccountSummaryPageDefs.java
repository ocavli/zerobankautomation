package com.zerobank.stepdefinitions;


import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountSummaryPageDefs {


    @When("the	user	clicks	on	Savings	link	on	the	Account	Summary	page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {

        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        accountSummaryPage.savings.click();



    }

    @Then("the	Account	Activity page	should	be	displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        String expectedURL= "http://zero.webappsecurity.com/bank/account-activity";
        Driver.get().getCurrentUrl().contains(expectedURL);
    }




}
