package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
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

    public WebElement activities(String activity){
        return Driver.get().findElement(By.xpath("//a[contains(.,'"+activity+"')]"));
    }

    @FindBy(xpath = "//a[@href='/bank/redirect.html?url=account-activity.html'][contains(.,'Account Activity')]")
    public WebElement AccountActivity;





}
