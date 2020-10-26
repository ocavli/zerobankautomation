package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;

public class AccountActivityPageDefs {
    AccountActivityPage transactions;





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


    @Given("the user accesses the {string} tab")
    public void the_user_accesses_the_tab(String titleName) {
        new AccountActivityPage().navigateTo(titleName);
        BrowserUtils.waitForPageToLoad(3);
    }

    @When("the user enters date range	from {string} to {string}")
    public void the_user_enters_date_range_from_to(String firstDate, String secondDate) {
        BrowserUtils.waitForPageToLoad(3);
        transactions = new AccountActivityPage();
        transactions.fromDate.sendKeys(firstDate);
        transactions.toDate.sendKeys(secondDate);





    }

    @When("clicks search")
    public void clicks_search() {
        new AccountActivityPage().findButton.click();
    }

    @Then("results table should only show	transactions dates between {string}	to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the	results	should be sorted by	most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the	results	table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("the {string} page should be displayed")
    public void thePageShouldBeDisplayed(String titleName) {
        Driver.get().getTitle().contains(titleName);
    }
}
