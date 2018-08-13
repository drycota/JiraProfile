package Test;

import Pages.LoginToJiraPage;
import Pages.UserPreferencesPage;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;


public class JiraChangeTimeZone {
    @Test
    public void JiraChangeTimeZone(){
        LoginToJiraPage loginPage = new LoginToJiraPage();
        UserPreferencesPage changeTimeZone = new UserPreferencesPage();

        Configuration.browser = "chrome";
        open("http://jira.hillel.it:8080");
        loginPage.enterUserName("webinar5");
        loginPage.enterPassword("webinar5");
        loginPage.clickSendButton();

        if(!loginPage.onPage()){
            Assert.fail("Not on page!!!");
        }

        changeTimeZone.clickOnfulHeaderButtonId();
        changeTimeZone.clickOnProfileButton();
        changeTimeZone.clickOnPrefEditButton();
        changeTimeZone.clickOnTimeZoneMenu();
        changeTimeZone.clickOnElementInDDM();
        changeTimeZone.clickOnElementInLocalization();
        changeTimeZone.clickOnUpdateButton();
    }
}
