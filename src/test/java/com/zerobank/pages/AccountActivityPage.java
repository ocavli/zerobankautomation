package com.zerobank.pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountActivityPage extends BasePage {
    @FindBy(xpath = "//select[contains(@name,'accountId')]")
    public WebElement AccountPropertiesBox;






}
