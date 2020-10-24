package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AccountActivityPageDefs {


    @Then("Account	drop	down	should	have	Savings	selected")
    public void account_drop_down_should_have_Savings_selected() {
        System.out.println("actual result" + new AccountActivityPage().AccountPropertiesBox.getText());

        //Assert.assertEquals("Savings",actualResult);

    }
}
