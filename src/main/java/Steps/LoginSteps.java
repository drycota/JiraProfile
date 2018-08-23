package Steps;

import Pages.LoginPageObject;
import Pages.ProfilePageObject;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.open;
import utils.ConfigProperties;

public class LoginSteps {

    public void LoginToJira(){

        //Configuration.remote = "http://localhost:4444/wd/hub";
        //Configuration.browser = "chrome";
        Configuration.browser = ConfigProperties.getTestProperty("useBrowser");

        //open("http://jira.hillel.it:8080/login.jsp");
        open(ConfigProperties.getTestProperty("jiraURL"));

        LoginPageObject loginPage = new LoginPageObject();
        loginPage.LoginToJira(ConfigProperties.getTestProperty("LoginWebinar5"),
                              ConfigProperties.getTestProperty("PasswordWebinar5"));
        //loginPage.LoginToJira("Dmitry_Prikota", "638Jawa638!!!");
        
        ProfilePageObject openUserProfile = new ProfilePageObject();
        openUserProfile.openProfileWindow();

    }

}
