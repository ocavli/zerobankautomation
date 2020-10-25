package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AccountActivityPageDefs {





    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String value) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();

        switch (value.toLowerCase()) {
            case "Savings":
                Assert.assertEquals("Savings", accountActivityPage.firstDisplayed());
                break;
            case "Brokerage":
                Assert.assertEquals("Brokerage", accountActivityPage.firstDisplayed());
                break;
            case "Checking":
                Assert.assertEquals("Checking", accountActivityPage.firstDisplayed());
                break;
            case "Loan":
                Assert.assertEquals("Loan", accountActivityPage.firstDisplayed());
                break;
            case "Credit card":
                Assert.assertEquals("Credit card", accountActivityPage.firstDisplayed());
                break;


        }

    }

}
