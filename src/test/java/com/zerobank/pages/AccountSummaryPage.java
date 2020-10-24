package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPage extends BasePage{

    @FindBy(xpath = "//a[@href='/bank/account-activity.html?accountId=1'][contains(.,'Savings')]")
    public WebElement savings;




}
