package Test;

import Pages.ChangePasswordPopUp;
import Pages.LoginToJiraPage;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class JiraChangePassword {
@Test
    public void JiraChangePassword() {
    LoginToJiraPage loginPage = new LoginToJiraPage();
    ChangePasswordPopUp changePassword = new ChangePasswordPopUp();

    Configuration.browser = "chrome";

    open("http://jira.hillel.it:8080");
    loginPage.enterUserName("webinar5");
    loginPage.enterPassword("webinar5");
    loginPage.clickSendButton();

    if(!loginPage.onPage()){
        Assert.fail("Not on page!!!");
    }


    changePassword.clickOnfulHeaderButtonId();
    changePassword.clickOnProfileButton();
    changePassword.clickOnChangePassLink();
    changePassword.enterCurrentPass("webinar5");
    changePassword.enterNewPass("webinar5");
    changePassword.enterNewPassForConfirm("webinar5");
    changePassword.clickOnupdateButton();
    }
}
