package com.zerobank.step_definitions;

import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class LoginPageDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        HomePage homePage = new HomePage();
        homePage.signinButton.click();
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        loginPage.login(username, password);
        Assert.assertTrue(Driver.get().getCurrentUrl().contains("http://zero.webappsecurity.com/bank/account-summary"));
    }


}
