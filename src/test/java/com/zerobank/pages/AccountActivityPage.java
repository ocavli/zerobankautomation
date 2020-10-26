package com.zerobank.pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPage extends BasePage {



    @FindBy(xpath = "//select[contains(@name,'accountId')]")
    public WebElement AccountActivitiesBox;

    public String firstDisplayed() {
        Select account = new Select(AccountActivitiesBox);
        return account.getFirstSelectedOption().getText();
    }

    @FindBy(xpath = "//input[@type='text'][contains(@id,'fromDate')]")
    public WebElement fromDate;

    @FindBy(xpath = "//input[@type='text'][contains(@id,'toDate')]")
    public WebElement toDate;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Find')]")
    public WebElement findButton;








}
