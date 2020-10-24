package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }




    @FindBy(xpath = "//input[@type='text'][contains(@id,'login')]")
    public WebElement userName;



    @FindBy(xpath = "//input[@type='password'][contains(@id,'password')]")
    public WebElement password;

    @FindBy(xpath = "//input[contains(@type,'submit')]")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

}
