package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPage extends BasePage{

    @FindBy(xpath = "//a[@href='/bank/account-activity.html?accountId=1'][contains(.,'Savings')]")
    public WebElement savings;

    @FindBy(xpath = "//a[@href='/bank/account-activity.html?accountId=6'][contains(.,'Brokerage')]")
    public WebElement brokerage;

    @FindBy(xpath = "//a[contains(.,'Checking')]")
    public WebElement checking;

    @FindBy(xpath = "//a[contains(.,'Credit Card')]")
    public WebElement creditCard;

    @FindBy(xpath = "//a[contains(.,'Loan')]")
    public WebElement loan;





}
